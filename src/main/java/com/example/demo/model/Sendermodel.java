package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="sender")
public class Sendermodel {
	@Id
	private String customerId;
	private String accountHolderName;
	private String clearBalance;
	private String overDraft;
	public Sendermodel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Sendermodel(String customerId, String accountHolderName, String clearBalance, String overDraft) {
		super();
		this.customerId = customerId;
		this.accountHolderName = accountHolderName;
		this.clearBalance = clearBalance;
		this.overDraft = overDraft;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName; 
	}
	public String getClearBalance() {
		return clearBalance;
	}
	public void setClearBalance(String clearBalance) {
		this.clearBalance = clearBalance;
	}
	public String getOverDraft() {
		return overDraft;
	}
	public void setOverDraft(String overDraft) {
		this.overDraft = overDraft;
	}
	@Override
	public String toString() {
		return "sender [customerId=" + customerId + ", accountHolderName=" + accountHolderName + ", clearBalance="
				+ clearBalance + ", overDraft=" + overDraft + "]";
	}
	
}
