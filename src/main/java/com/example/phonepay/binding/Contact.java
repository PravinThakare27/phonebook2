package com.example.phonepay.binding;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Data
@Setter
@Getter
@Entity
@Table(name ="contact_details")
public class Contact {
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer contactid;
	private String contactname;
	private String contactemail;
	private Long contactnumber;

}
