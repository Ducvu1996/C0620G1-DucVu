package com.codegym.blog.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity(name="category")
public class Category {
    @Id
    private Integer category_id;
    private String category_name;
    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
    private List<Blog> blogList;
    public Category() {
    }

    public Integer getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Integer category_id) {
        this.category_id = category_id;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }
}
