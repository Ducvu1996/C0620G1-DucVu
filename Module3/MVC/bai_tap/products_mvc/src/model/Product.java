package model;

public class Product {
    private int id;
    private String nameProduct;
    private String codeProduct;
    private String price;
    private String country;
   public Product (){

    }
    public Product(int id, String nameProduct, String codeProduct, String price, String country) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.codeProduct = codeProduct;
        this.price = price;
        this.country = country;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getCodeProduct() {
        return codeProduct;
    }

    public void setCodeProduct(String codeProduct) {
        this.codeProduct = codeProduct;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
