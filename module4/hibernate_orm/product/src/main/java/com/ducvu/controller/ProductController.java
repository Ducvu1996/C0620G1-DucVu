package com.ducvu.controller;

import com.ducvu.entity.Product;
import com.ducvu.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;


@Controller
@RequestMapping({"/product",""})
public class ProductController {
    @Autowired
    private ProductService productService;
    @GetMapping("/")
    public String index(Model model, RedirectAttributes redirectAttributes){
//        List<Product> products =productService.findAll();
        List<Product> products = productService.findAll();
        model.addAttribute("products",products);
        redirectAttributes.addFlashAttribute("success","");
        return "index";
    }
    @GetMapping("/product/create")
    public String create(Model model) {
        model.addAttribute("product", new Product());
        return "create";
    }
    @PostMapping("/product/save")
    public String save(Product product, RedirectAttributes redirectAttributes) {

        productService.save(product);
        redirectAttributes.addFlashAttribute("success", "Saved product successfully!");
        return "redirect:/";
    }
    @GetMapping("/product/{id}/edit")
    public String edit(@PathVariable int id, Model model) {
        model.addAttribute("product", productService.findById(id));
        return "edit";
    }
    @PostMapping("/product/update")
    public String update(Product product, RedirectAttributes redirect) {
        productService.update(product);
        redirect.addFlashAttribute("success", "Modified product successfully!");
        return "redirect:/";
    }
    @GetMapping("/product/{id}/delete")
    public String delete(@PathVariable int id, Model model) {
        model.addAttribute("product", productService.findById(id));
        return "delete";
    }
    @PostMapping("/product/delete")
    public String delete(Product product, RedirectAttributes redirect) {
        productService.remove(product.getProduct_id());
        redirect.addFlashAttribute("success", "Removed product successfully!");
        return "redirect:/";
    }
    @GetMapping("/product/{id}/view")
    public String view(@PathVariable int id, Model model) {
        model.addAttribute("product", productService.findById(id));
        return "view";
    }

}
