package DAO;

import model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ProductDAOImpl implements ProductDAO {
    static Map<Integer,Product> productMap =new TreeMap<>();
    static {
        productMap.put(1,new Product(1,"iphone","SP0001","1000","USA"));
        productMap.put(2,new Product(2,"sam sung","SP0002","900","KOREA"));
        productMap.put(3,new Product(3,"nokia","SP0003","800","USA"));
        productMap.put(4,new Product(3,"s4","SP0003","800","USA"));
    }
    @Override
    public List<Product> findAll() {
        return new ArrayList<>(productMap.values());
    }

    @Override
    public String save(Product product) {
        productMap.put(product.getId(),product);
        return "Ok";
    }

    @Override
    public Product findById(int id) {
        return productMap.get(id);
    }

    @Override
    public void update(int id, Product product) {
        productMap.put(id,product);
    }

    @Override
    public void remove(int id) {
        productMap.remove(id);
    }

    @Override
    public List<Product> findByName(String nameProduct) {
       List<Product> productList = new ArrayList<>();
        for(Product product: productMap.values()){
            if(product.getNameProduct().contains(nameProduct)){

                productList.add(product);
            }
        }
        return productList;

    }
}
