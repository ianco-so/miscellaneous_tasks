package tarefa11;

public class OrderItem {
	Integer quantity;
	Product product;
	
	protected OrderItem(Integer quantity, Product product) {
		this.quantity = quantity;
		this.product = product;
	}
	
	protected Integer getQuantity() {	return quantity;}
	protected void setQuantity(Integer quantity) {	this.quantity = quantity;	}
	protected Double getPrice() {	return this.product.getPrice();}
	protected Product getProduct() {	return product;}
	protected void setProduct(Product product) {	this.product = product;}
	
	protected Double subTotal (){	return this.quantity*this.product.getPrice();}
	
	public String toString() {	
		return String.format(product.toString()+","
				+ " Quantity: %d, Subtotal: $%.2f",getQuantity(), subTotal());
	}
}