package entities;

public class Product {
	private String name;
	private Double price;
	private Integer quantity;
	
	public Product() {}
	public Product(String name, Double price, Integer quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	protected String getName() {	return name;}
	protected void setName(String name) {	this.name = name;}
	protected Double getPrice() {	return price;}
	protected void setPrice(Double price) {	this.price = price;}
	protected Integer getQuantity() {	return quantity;}
	protected void setQuantity(Integer quantity) {	this.quantity = quantity;}
	
	@Override
	public String toString() {	return name+","+price*quantity;}
	
	
}