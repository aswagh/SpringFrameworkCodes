package com.spring_framework.CollectionXmlConfiguration;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.spring_framework.SpringXmlConfigurations.beans.Student;

public class Employee {
	
	private int employeeId;
	private String employeeName;
	private List<String> phones;
	private Set<String> addresses;
	private Map<String,String> courses;
	private Student student;
	
	

	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(Student student) {
		super();
		this.student = student;
	}
	
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public List<String> getPhones() {
		return phones;
	}
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	public Set<String> getAddresses() {
		return addresses;
	}
	public void setAddresses(Set<String> addresses) {
		this.addresses = addresses;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", phones=" + phones
				+ ", addresses=" + addresses + ", courses=" + courses + ", student=" + student + "]";
	}
	

}
