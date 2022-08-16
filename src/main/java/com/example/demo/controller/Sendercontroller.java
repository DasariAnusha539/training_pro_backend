package com.example.demo.controller;

import java.util.List;

import com.example.demo.model.Sendermodel;
import com.example.demo.repository.SenderRepo;
import com.example.demo.service.Senderservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Sendercontroller {
	
	@Autowired	
	Senderservice senderService;
	
	@GetMapping("/getSender")
    public Sendermodel getSender(@RequestParam String custId) {
        return senderService.getSender(custId);
    }
	
	@GetMapping("/getSenderoverdaft")
    public String getSender1(@RequestParam String custId) {
        return senderService.getSender1(custId); 
    }
	
	@GetMapping("/getSenderAccount")
    public String getSender2(@RequestParam String custId) {
        return senderService.getSender2(custId);  
    }
	
	@GetMapping("/getAllcustomerid")
    public List<Sendermodel> getallBankAccounts() {
        return senderService.getallBankAccounts();  
    }
	
	
	
	
	
	
    
	
	/*@GetMapping("/getSender")
	public Sendermodel getSender(@RequestParam String custId) {
		return senderService.getSender(custId); 
	 }*/

}

