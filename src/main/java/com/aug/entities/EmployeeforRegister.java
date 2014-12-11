package com.aug.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Person")
public class EmployeeforRegister {

	@Id
    @Column(name="ID")
    @GeneratedValue
    private int id;
    
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
	
	@Column(name="Email")
	private String email;
	
	
	@Column(name="User")
	private String user;
	
	@Column(name="Password")
	private String password;
	
 
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
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



	public String getDateofbirth()  {

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


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getUser() {
		return user;
	}


	public void setUser(String user) {
		this.user = user;
	}



	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "EmployeeforRegister [name=" + name + ", surname=" + surname
				+ ", dateofbirth=" + dateofbirth + ", address=" + address
				+ ", gender=" + gender + ", user=" + user + ", password="
				+ password + "]";
	}


	
	
	
}
