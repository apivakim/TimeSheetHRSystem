package com.aug.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employees")
public class EmployeeMem {
	

	@Id
    @Column(name="ID")
    @GeneratedValue
    private int id;
	
	@Column(name="Idcard")
	private String idcard;
    
	@Column(name="Name")
	private String name;
	
	@Column(name="Surname")
	private String surname;
	
	@Column(name="Dateofbirth")
	private String dateofbirth;
	
	
	@Column(name="Address")
	private String address;
	
	
	@Column(name="Gender")
	private String gender;
	
	@Column(name="Mobile")
	private String mobile;
	
	@Column(name="Email")
	private String email;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIdcard() {
		return idcard;
	}

	public void setIdcard(String idcard) {
		this.idcard = idcard;
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

	public String getDateofbirth() {
		return dateofbirth;
	}

	public void setDateofbirth(String dateofbirth) {
		this.dateofbirth = dateofbirth;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "EmployeeMem [id=" + id + ", Idcard=" + idcard + ", name=" + name
				+ ", surname=" + surname + ", dateofbirth=" + dateofbirth
				+ ", address=" + address + ", gender=" + gender + ", mobile="
				+ mobile + ", email=" + email + "]";
	}

	
	

}
