package com.example.phonepay.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.phonepay.binding.Contact;

public interface ContactRepository extends JpaRepository<Contact,Integer> {

}
