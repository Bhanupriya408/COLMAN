package com.mph.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Driver {

	@Id
	private int did;
	private String dname;
	private String address;
	private int busno;
	private String phno;
	
	
	public Driver() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Driver(int did, String dname, String address, int busno, String phno) {
		super();
		this.did = did;
		this.dname = dname;
		this.address = address;
		this.busno = busno;
		this.phno = phno;
	}


	public int getDid() {
		return did;
	}


	public void setDid(int did) {
		this.did = did;
	}


	public String getDname() {
		return dname;
	}


	public void setDname(String dname) {
		this.dname = dname;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public int getBusno() {
		return busno;
	}


	public void setBusno(int busno) {
		this.busno = busno;
	}


	public String getPhno() {
		return phno;
	}


	public void setPhno(String phno) {
		this.phno = phno;
	}


	@Override
	public String toString() {
		return "Driver [did=" + did + ", dname=" + dname + ", address=" + address + ", busno=" + busno + ", phno="
				+ phno + "]";
	}
	
	
	
}
