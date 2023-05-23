package com.myspace.printdto;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Package implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "name")
	private java.lang.String name;
	@org.kie.api.definition.type.Label(value = "designation")
	private java.lang.String designation;
	@org.kie.api.definition.type.Label(value = "emailId")
	private java.lang.String emailId;
	@org.kie.api.definition.type.Label(value = "department")
	private java.lang.String department;
	@org.kie.api.definition.type.Label(value = "salaryOffered")
	private java.lang.Float salaryOffered;

	public Package() {
	}

	public java.lang.String getName() {
		return this.name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	public java.lang.String getDesignation() {
		return this.designation;
	}

	public void setDesignation(java.lang.String designation) {
		this.designation = designation;
	}

	public java.lang.String getEmailId() {
		return this.emailId;
	}

	public void setEmailId(java.lang.String emailId) {
		this.emailId = emailId;
	}

	public java.lang.String getDepartment() {
		return this.department;
	}

	public void setDepartment(java.lang.String department) {
		this.department = department;
	}

	public java.lang.Float getSalaryOffered() {
		return this.salaryOffered;
	}

	public void setSalaryOffered(java.lang.Float salaryOffered) {
		this.salaryOffered = salaryOffered;
	}

	public Package(java.lang.String name, java.lang.String designation,
			java.lang.String emailId, java.lang.String department,
			java.lang.Float salaryOffered) {
		this.name = name;
		this.designation = designation;
		this.emailId = emailId;
		this.department = department;
		this.salaryOffered = salaryOffered;
	}

}