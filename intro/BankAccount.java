package intro;

import java.util.*;

public class BankAccount {
	private String accountHoldername;
	private String accountNumber;
	private double balance;
	private List<String> transactions;
	
	BankAccount(String accountHoldername, String accountNumber){
		this.accountHoldername = accountHoldername;
		this.accountNumber = accountNumber;
		this.balance = 0.0;
		this.transactions = new ArrayList<>();
	}
	
	public String getAccountHoldername() {
		return accountHoldername;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public void getDetail() {
		System.out.print("Account Details are:" + "\n" + accountHoldername + 
			"\n" + accountNumber + "\n" + balance + "\n");
	}
	
	public void getTransactions() {
		for(String transact: transactions) {
			System.out.println(transact);
		}
	}
	
	
	public void setAccountHoldername(String accountHoldername) {
		this.accountHoldername = accountHoldername;
	}
	
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	
	public void setBalance(double amount) {
		if(amount>0) {
			balance += amount;
			transactions.add(amount + " is deposited");
		}else {
			System.out.println("Invalid deposit amount.");
		}
	}

	public void withDrawal(double amount) {
		if(amount<=balance && amount>0) {
			balance -=amount;
			transactions.add("amount deducted " + amount);
		}else {
			System.out.println("Invalid withdrawal amount or insufficient funds.");
		}
	}
	
	
	
	
}
