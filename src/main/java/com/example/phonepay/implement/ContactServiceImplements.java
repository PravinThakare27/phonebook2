package com.example.phonepay.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.phonepay.Repository.ContactRepository;
import com.example.phonepay.binding.Contact;
import com.example.phonepay.service.ContactService;
@Service
public class ContactServiceImplements implements ContactService {
	
	@Autowired
	ContactRepository conrepo;
	@Override
	public List<Contact> getallcontact() {
		// TODO Auto-generated method stub
		return conrepo.findAll();
	}

	@Override
	public String updatecontact(Contact c) {
		// TODO Auto-generated method stub
		Contact c1=conrepo.findById(c.getContactid()).get();
		c1.setContactname(c.getContactname());
		c1.setContactemail(c.getContactemail());
		c1.setContactnumber(c.getContactnumber());
		conrepo.save(c1);
		
		if(c1!=null) {
			return "Update Successfully";
		}
		else {
		return "Faild Updation";
		}
	}

	@Override
	public Contact getcontactbyid(Integer contact_id) {
		// TODO Auto-generated method stub
		return conrepo.findById(contact_id).get();
	}

	@Override
	public String deletecontact(Integer contact_id) {
		// TODO Auto-generated method stub
		Contact c=conrepo.findById(contact_id).get();
		if(c!=null) {
		conrepo.deleteById(contact_id);
		return "Delete Record";
		}
		else {
			return "Not delete";
		}
		
		
	}

	@Override
	public String addcontact(Contact c) {
		// TODO Auto-generated method stub
		c=conrepo.save(c);
		if(c!=null) {
		
			return "Add Contact";
			}
			else {
				return "Not Added";
			}
	}



}
