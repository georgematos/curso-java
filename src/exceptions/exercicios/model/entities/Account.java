package exceptions.exercicios.model.entities;

import exceptions.exercicios.model.exections.TransactionException;

public class Account {

	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;

	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}
	
	public void deposit(Double amount) {
		this.balance += amount;
		System.out.println("New balance: " + balance);
	}
	
	public void withdraw(Double amount) throws TransactionException {
		if (amount > withdrawLimit) {
			throw new TransactionException("Withdraw error: The amount exceeds withdraw limit");
		}
		if (amount > balance) {
			throw new TransactionException("Withdraw error: Not enough balance");
		}
		balance -= amount;
		System.out.println("New balance: " + balance);
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

}
