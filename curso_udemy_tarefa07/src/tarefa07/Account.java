package tarefa07;

public class Account {
	private int number;
	private String name;
	private double balance;
	
	protected Account(int number, String name, double initialValue) {
		this.number = number;
		this.name = name;
		add(initialValue);
	}
	protected Account(int number, String name) {
		this.number = number;
		this.name = name;
		this.balance = 0.0;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public int getNumber() {
		return number;
	}
	
	public void add (double value) {
		balance += Math.abs(value);
	}
	public void take (double value) {
		balance -= Math.abs(value)+5.0;
	}
	public String toString () {
		return String.format("Numer: %d, Holder: %s, Balance: %.2f",number,name,balance);
	}
}
