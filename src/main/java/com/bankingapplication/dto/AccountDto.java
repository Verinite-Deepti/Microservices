package com.bankingapplication.dto;

import java.time.LocalDate;

public class AccountDto {
	  private Long cust_id;
	    private String first_name;
	    private String last_name;
	    private LocalDate dob; 
	    private String accno; 
	    private String branch;
	    private String address_line1;
	    private String city;
	    private String state;
	    private Long pincode;

		
	    public AccountDto() {
			super();
			// TODO Auto-generated constructor stub
		}

		public AccountDto(Long cust_id, String first_name, String last_name, LocalDate dob, String accno,
				String branch, String address_line1, String city, String state, Long pincode) {
			super();
			this.cust_id = cust_id;
			this.first_name = first_name;
			this.last_name = last_name;
			this.dob = dob;
			this.accno = accno;
			this.branch = branch;
			this.address_line1 = address_line1;
			this.city = city;
			this.state = state;
			this.pincode = pincode;
		}
		

		public Long getCust_id() {
	        return cust_id;
	    }

	    public void setCust_id(Long cust_id) {
	        this.cust_id = cust_id;
	    }

	    public String getFirst_name() {
	        return first_name;
	    }

	    public void setFirst_name(String first_name) {
	        this.first_name = first_name;
	    }

	    public String getLast_name() {
	        return last_name;
	    }

	    public void setLast_name(String last_name) {
	        this.last_name = last_name;
	    }

	    public String getBranch() {
	        return branch;
	    }

	    public void setBranch(String branch) {
	        this.branch = branch;
	    }

	    public String getAddress_line1() {
	        return address_line1;
	    }

	    public void setAddress_line1(String address_line1) {
	        this.address_line1 = address_line1;
	    }

	    public String getCity() {
	        return city;
	    }

	    public void setCity(String city) {
	        this.city = city;
	    }

	    public String getState() {
	        return state;
	    }

	    public void setState(String state) {
	        this.state = state;
	    }

	    public Long getPincode() {
	        return pincode;
	    }

	    public void setPincode(Long pincode) {
	        this.pincode = pincode;
	    }

	    public LocalDate getDob() {
	        return dob;
	    }

	    public void setDob(LocalDate dob) {
	        this.dob = dob;
	    }

	    public String getAccno() {
	        return accno;
	    }

	    public void setAccno(String accno) {
	        this.accno = accno;
	    }
	}
