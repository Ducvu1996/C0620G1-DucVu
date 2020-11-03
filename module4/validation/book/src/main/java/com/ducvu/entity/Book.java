package com.ducvu.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "book")
public class Book {
    @Id
    private String code;
    private String name;
    private boolean status;

    public Book() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
