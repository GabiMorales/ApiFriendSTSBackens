package com.gab;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Friend {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String firstname;
	private String lastname;
	private String departament;
	private String email;
	private String country;
	
	public Friend() {
		super();
	}
	
	public Friend(Integer id, String firstname, String lastname, String departament, String email, String country) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.departament = departament;
		this.email = email;
		this.country = country;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getDepartament() {
		return departament;
	}

	public void setDepartament(String departament) {
		this.departament = departament;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
