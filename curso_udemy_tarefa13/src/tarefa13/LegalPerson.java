package tarefa13;

public class LegalPerson extends Person {
	private Integer employee;
	
	protected LegalPerson() {	super();}
	protected LegalPerson(String name, Double income, Integer employee) {
		super(name, income);
		this.employee = employee;
	}
	
	protected Integer getEmployee() {	return employee;}
	protected void setEmployee(Integer employee) {	this.employee = employee;}
	
	@Override
	protected Double tax() {
		Double tax = 0.0;
		if (getEmployee() > 10)
			tax += getIncome() * 0.14;
		else
			tax += getIncome() * 0.16;
		return tax;
	}
}