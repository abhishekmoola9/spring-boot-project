package com.acs.model;

import java.util.Date;

public class Employee {
private long id;
private String firstName;
private String lastName;
private Date date;

public Employee() {
	super();
}
public Employee(long id, String firstName, String lastName, Date date) {
	super();
	this.id = id;
	this.firstName = firstName;
	this.lastName = lastName;
	this.date = date;
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
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
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}

}
