package tarefa13;

public class PhysicalPerson extends Person{
	private Double healExpend;
	
	protected PhysicalPerson() {	super();}
	protected PhysicalPerson(String name, Double income, Double healExpend) {
		super(name, income);
		this.healExpend = healExpend;
	}
	
	protected Double getHealExpend() {	return healExpend;}
	protected void setHealExpend(Double healExpend) {	this.healExpend = healExpend;}
	
	@Override
	protected Double tax() {
		Double tax = 0.0;
		if(getIncome() < 20000.00)	tax += getIncome()*0.15;
		else	tax += getIncome()*0.25;
		tax += -healExpend*0.5;
		return tax;
	}
}