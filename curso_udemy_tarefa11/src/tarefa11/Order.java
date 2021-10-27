package tarefa11;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
	private static final SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy HH:mm:ss");
	
	private Date moment;
	private OrderStatus status;
	private Client client;
	private List<OrderItem> items = new ArrayList<>();
	
	protected Order(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}
	
	protected Date getMoment() {	return moment;}
	protected void setMoment(Date moment) {	this.moment = moment;}
	protected OrderStatus getStatus() {	return status;}
	protected void setStatus(OrderStatus status) {	this.status = status;}
	protected List<OrderItem> getItems() {	return items;}
	protected Client getClient() {	return client;}
	protected void setClient(Client client) {	this.client = client;}

	protected void addItem (OrderItem item) {	items.add(item);}
	protected void removeItem (OrderItem item) { items.remove(item);}
	
	protected Double total () {
		Double sum = 0.0;
		for (OrderItem item: items) sum += item.subTotal();
		return sum;
	}
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: "+sdf.format(getMoment())+"\n");
		sb.append("Order status: "+getStatus()+"\n");
		sb.append("Client: "+this.client.toString()+"\n");
		sb.append("Order items:\n");
		for (OrderItem item: this.items)	sb.append(item.toString()+"\n");
		return sb.toString();
	}
	
}