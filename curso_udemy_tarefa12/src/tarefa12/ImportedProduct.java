package tarefa12;

public final class ImportedProduct extends Product{
	Double fee;
	
	protected ImportedProduct () {	super();}
	protected ImportedProduct(String name, Double price, Double fee) {
		super(name, price);
		this.fee = fee;
	}
	
	protected Double getFee() {	return fee;}
	protected void setFee(Double fee) {	this.fee = fee;}
	
	@Override
	protected String priceTag () {	return getName()+" $"+totalPrice()+" (Customs fee: "+getFee()+")";}
	
	protected Double totalPrice () {	return getPrice()+getFee();}
}