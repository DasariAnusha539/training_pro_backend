package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="receiver")
public class Receivermodel {
	@Id
	String bic;
	String bankname;
	//from superclass
	//from fields
	//getter and setter
	//tostring 
	public Receivermodel() {
		super();
		//TODO Auto-generated constructor stub
	}
	public Receivermodel(String bic, String bankname) {
		super();
		this.bic = bic;
		this.bankname = bankname;
	}
	public String getBic() {
		return bic;
	}
	public void setBic(String bic) {
		this.bic = bic;
	}
	public String getBankname() {
		return bankname;
	}
	public void setBankname(String bankname) {
		this.bankname = bankname;
	}
	@Override
	public String toString() {
		return "Receivermodel [bic=" + bic + ", bankname=" + bankname + "]";
	}
	
}