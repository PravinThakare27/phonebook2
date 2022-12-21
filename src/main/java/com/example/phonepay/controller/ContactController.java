package com.example.phonepay.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.phonepay.binding.Contact;
import com.example.phonepay.service.ContactService;

@RestController
@RequestMapping("contact")
@CrossOrigin
public class ContactController {
@Autowired
ContactService conser;
@GetMapping("/getallcontact")
public List<Contact> getallcontact () {
	return conser.getallcontact();
}

@PostMapping("/addcontact")
public String addcontact(@RequestBody Contact C1) {
	System.out.println(C1.getContactname());
	return conser.addcontact(C1);
}

@PutMapping("/updatecontact")
public String updatecontact(@RequestBody Contact C1) {
	return conser.updatecontact(C1);
}

@GetMapping("/getcontactbyid/{id}")
public Contact getcontactbyid(@PathVariable("id") Integer i) {
	return conser.getcontactbyid(i);
	
}

@GetMapping("/deletecontactbyid/{id}")
public String deletecontactbyid(@PathVariable("id") Integer i) {
	return conser.deletecontact(i);
	
}
}

