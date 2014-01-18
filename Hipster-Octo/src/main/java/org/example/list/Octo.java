package org.example.list;

import java.util.List;

import org.example.db.EntityBase;

public class Octo extends EntityBase {

	
	
	private String number;
	private String name;
	private String surname;
	private String email;
	
	
	public List<Attack> addresses;
	
	public List<Character> character;
	
	
	public List<Attack> getAddresses() {
		return addresses;
	}
	public void setAddresses(List<Attack> addresses) {
		this.addresses = addresses;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
