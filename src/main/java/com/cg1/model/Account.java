package com.cg1.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document("Account")
public class Account {
	@Id
	private int accountId;
	private String accountHoldername;
	private int amount;
	
	
	
	public Account() {
		
	}
	public Account(int accountId, String accountHoldername, int amount) {
		super();
		this.accountId = accountId;
		this.accountHoldername = accountHoldername;
		this.amount = amount;
	}
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public String getAccountHoldername() {
		return accountHoldername;
	}
	public void setAccountHoldername(String accountHoldername) {
		this.accountHoldername = accountHoldername;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	

}
