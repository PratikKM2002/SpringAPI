package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class College {
 private int id;
 private String collegeadmin;
 private String college_name;
 private String location;

public College() {
	super();
}
public College(int id, String collegeadmin, String college_name, String location) {
	super();
	this.id = id;
	this.collegeadmin = collegeadmin;
	this.college_name = college_name;
	this.location = location;
	}
 @Id
 @GeneratedValue(strategy=GenerationType.IDENTITY)
 
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getCollegeadmin() {
	return collegeadmin;
}
public void setCollegeadmin(String collegeadmin) {
	this.collegeadmin = collegeadmin;
}
public String getCollegeName() {
	return college_name;
}
public void setCollegeName(String college_name) {
	this.college_name = college_name;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
@Override
public String toString() {
	return "College [id=" + id + ", collegeadmin=" + collegeadmin + ", college_name=" + college_name + ", location="
			+ location + "]";
}

 
}

