package org.example.list;

import org.example.db.EntityBase;

public class Attack extends EntityBase {

	private String city;
	private String street;
	private String postalCode;
	private String houseNumber;
	private int localNumber;
	

	private Octo octo;
	
	
	public Octo getOcto() {
		return octo;
	}
	public void setOcto(Octo octo) {
		this.octo = octo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}
	public int getLocalNumber() {
		return localNumber;
	}
	public void setLocalNumber(int localNumber) {
		this.localNumber = localNumber;
	}
	
	
}
