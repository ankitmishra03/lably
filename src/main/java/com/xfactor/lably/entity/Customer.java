package com.xfactor.lably.entity;

/**
 * Customer
 */
public class Customer {
    private String Id;
    private String name;
    private String address;
    private String age;
    private String gender;

    public void setId(String Id) {
		this.Id = Id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAge() {
		return this.age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}


}