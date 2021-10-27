package tarefa13;

public abstract class Person {
	private String name;
	private Double income;
	
	protected Person() {}
	protected Person(String name, Double income) {
		this.name = name;
		this.income = income;
	}
	
	protected String getName() {	return name;}
	protected void setName(String name) {	this.name = name;}
	protected Double getIncome() {	return income;}
	protected void setIncome(Double income) {	this.income = income;}
	
	protected abstract Double tax();
}
