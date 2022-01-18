package com.facebooklive.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="facebooklive")
public class FacebookUser {
	private String name;
	private String password;
	@Id
	private String email;
	
	private String gender;
	
	
	
	@Column(name="dob")
	private String age;
	
	@OneToMany(mappedBy = "fl")
	private List<TimeLine> tl;
	
	
	
	public List<TimeLine> getTl() {
		return tl;
	}
	public void setTl(List<TimeLine> tl) {
		this.tl = tl;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
	
}
