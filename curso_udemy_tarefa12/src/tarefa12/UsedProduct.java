package tarefa12;

import java.text.SimpleDateFormat;
import java.util.Date;

public final class UsedProduct extends Product {
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private Date manufactureDate;
	
	protected UsedProduct() {	super();}
	protected UsedProduct(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}
	
	protected Date getManufactureDate() {	return manufactureDate;}
	protected void setManufactureDate(Date manufactureDate) {	this.manufactureDate = manufactureDate;}
	
	@Override
	protected String priceTag () {	
		return getName()+" (Used) $"+getPrice()+" (Manufactured date: "+sdf.format(getManufactureDate())+")";
	}
}