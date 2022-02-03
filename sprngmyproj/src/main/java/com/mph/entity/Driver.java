package com.mph.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
/**
 * 
 * @author Radha
 *
 */
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
	/**
	 * 
	 * @param did is the driver id
	 * @param dname is driver name
	 * @param address is driver address
	 * @param busno is busno of driver
	 * @param phno is drivers phone number
	 */


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
    /**
     * 
     * @param did to get driver id
     */

	public void setDid(int did) {
		this.did = did;
	}


	public String getDname() {
		return dname;
	}
	/**
	 * 
	 * @param dname to get driver name
	 */


	public void setDname(String dname) {
		this.dname = dname;
	}


	public String getAddress() {
		return address;
	}
	/**
	 * 
	 * @param address to get driver address
	 */


	public void setAddress(String address) {
		this.address = address;
	}


	public int getBusno() {
		return busno;
	}
    /**
     * 
     * @param busno 
     */

	public void setBusno(int busno) {
		this.busno = busno;
	}


	public String getPhno() {
		return phno;
	}
    /**
     * 
     * @param phno is to get drivers Number
     */

	public void setPhno(String phno) {
		this.phno = phno;
	}
  

	@Override
	public String toString() {
		return "Driver [did=" + did + ", dname=" + dname + ", address=" + address + ", busno=" + busno + ", phno="
				+ phno + "]";
	}
	
	
	
}
