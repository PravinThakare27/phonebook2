package com.example.phonepay.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.phonepay.binding.Contact;

@Service
public interface ContactService {
public List<Contact> getallcontact();
public Contact getcontactbyid(Integer contact_id);
public String deletecontact(Integer contact_id);
public String addcontact(Contact c);
public String updatecontact(Contact c);
}
