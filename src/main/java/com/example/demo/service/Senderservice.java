package com.example.demo.service;

import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.example.demo.model.Sendermodel;
import com.example.demo.repository.SenderRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Senderservice {



   @Autowired
    SenderRepo senderRepo;
    
    public String validateDayName(String date) throws ParseException {
        String res = "";
        Format f = new SimpleDateFormat("EEEE");
        Date date1 = new SimpleDateFormat("yyyy-MM-dd").parse(date);
        res = f.format(date1);
        return res;
    }
    
    public Sendermodel getSender(String custId) {
        Sendermodel sender = senderRepo.findById(custId).orElse(new Sendermodel());
        return sender;
    }
    
    public String getSender1(String custId) {
        Sendermodel sender = senderRepo.findById(custId).orElse(new Sendermodel());
        return sender.getOverDraft();
    }
    
    public String getSender2(String custId) {
        Sendermodel sender = senderRepo.findById(custId).orElse(new Sendermodel());
        return sender.getAccountHolderName();    
        }
    
    public List<Sendermodel> getallBankAccounts(){
    	return senderRepo.findAll();
    }
    
    
}