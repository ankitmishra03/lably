package com.xfactor.lably.entity;

public class Lab {
    private String Id;

    private String name;

    private String phone;

    private String address;

    private String pincode;

    public String getId() {
		return this.Id;
	}

	public void setId(String Id) {
		this.Id = Id;
	}

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    

}
