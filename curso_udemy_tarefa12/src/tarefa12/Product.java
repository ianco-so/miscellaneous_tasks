package tarefa12;

public class Product {
	private String name;
	private Double price;
	
	protected Product() {}
	protected Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}
	
	protected String getName() {	return name;}
	protected void setName(String name) {	this.name = name;}
	protected Double getPrice() {	return price;}
	protected void setPrice(Double price) {	this.price = price;}
	
	protected String priceTag () {	return getName()+" $"+getPrice();}
}
