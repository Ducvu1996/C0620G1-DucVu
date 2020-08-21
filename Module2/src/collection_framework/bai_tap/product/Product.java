package collection_framework.bai_tap.product;



public class Product implements Comparable<Product>{
	 String nameProduct;
	 int id;
	 int price;
	public Product() {
	
	}
	public Product(String nameProduct, int id, int price) {
		this.nameProduct = nameProduct;
		this.id = id;
		this.price = price;
	}
	public String getNameProduct() {
		return nameProduct;
	}
	public void setNameProduct(String nameProduct) {
		this.nameProduct = nameProduct;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public int compareTo(Product otherProduct) {
		return this.getPrice()-otherProduct.getPrice();
	}
}
