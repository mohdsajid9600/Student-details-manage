package com.entity;

public class Student {

	private int id;
	private String name;
	private String dod;
	private String address;
	private String qualification;
	private String email;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, String dod, String address, String qualification, String email) {
		super();
		this.name = name;
		this.dod = dod;
		this.address = address;
		this.qualification = qualification;
		this.email = email;
	}
	
	
	
	public Student(int id, String name, String dod, String address, String qualification, String email) {
		super();
		this.id = id;
		this.name = name;
		this.dod = dod;
		this.address = address;
		this.qualification = qualification;
		this.email = email;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the fullName
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param fullName the fullName to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the dod
	 */
	public String getDod() {
		return dod;
	}
	/**
	 * @param dod the dod to set
	 */
	public void setDod(String dod) {
		this.dod = dod;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the qualification
	 */
	public String getQualification() {
		return qualification;
	}
	/**
	 * @param qualification the qualification to set
	 */
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", dod=" + dod + ", address=" + address
				+ ", qualification=" + qualification + ", email=" + email + "]";
	}
	
	
}
