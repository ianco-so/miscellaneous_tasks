package model.entities;

import model.exceptions.InternalException;

public class Account {
	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;
	
	public Account(Integer number, String holder, Double balance, Double withdrawLimit) throws InternalException {
		if (balance < 0.0) {	throw new InternalException("Balance must be a positive value");}
		if (withdrawLimit < 0.0) {	throw new InternalException("Withdraw limit must be a positiv value");}
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}
	
	public Integer getNumber() {	return number;}
	public void setNumber(Integer number) {	this.number = number;}
	public String getHolder() {	return holder;}
	public void setHolder(String holder) {	this.holder = holder;}
	public Double getWithdrawLimit() {	return withdrawLimit;}
	public void setWithdrawLimit(Double withdrawLimit) {	this.withdrawLimit = withdrawLimit;}
	public Double getBalance() {	return balance;}
	
	@Override
	public String toString() {	return "number="+number+", holder="+holder+", balance="+balance+", withdrawLimit="+withdrawLimit;}

	public void deposit(Double amount) {	this.balance += +amount;}
	public void withdraw (Double amount) throws InternalException{
		if (amount > getWithdrawLimit()) {	throw new InternalException("The amount exceeds the withdraw limit");}
		if (amount > getBalance()) {	throw new InternalException("Not enough balance");}
		this.balance += -amount;
	}
}