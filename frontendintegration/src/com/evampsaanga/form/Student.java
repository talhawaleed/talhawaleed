package com.evampsaanga.form;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Student

{
		
	public String uId;
	public String firstName;
	public String lastName;
	public String semester;
	public String section;
	public String degree;
	public String country;
	
	
	
	List<String> countryCount = new ArrayList<>();
	
	
	

	public Student() {
		
		countryCount.add("Pakistan");
		countryCount.add("India");
		countryCount.add("Iran");
		countryCount.add("Iraq");
		countryCount.add("Turkey");
	}

	public List<String> getCountryCount() {
		return countryCount;
	}

	public String getuId() {
		return uId;
	}

	public void setuId(String uId) {
		this.uId = uId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSemester() {
		return semester;
	}

	public void setSemester(String semester) {
		this.semester = semester;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	
	

}
