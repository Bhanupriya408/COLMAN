package com.mph.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
/**
 * 
 * @author BhanuPriya
 * 
 *
 */

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int sid;
	private String sname;
	private String address;
	private String phno;
	private String gender;
	private int busno;
	private String status;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * creates an student with the specified name.
	 * @param sid is student id
	 * @param sname student name
	 * @param address of student 
	 * @param phno student phone number
	 * @param gender of student
	 * @param busno of student
	 * @param status of student paid or not
	 */

	public Student(int sid, String sname, String address, String phno, String gender, int busno, String status) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.address = address;
		this.phno = phno;
		this.gender = gender;
		this.busno = busno;
		this.status = status;
	}

	public int getSid() {
		return sid;
	}
	/**
	 * 
	 * @param sid
	 * @return student id
	 */

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}
	/**
	 * 
	 * @param  get sname
	 * @return  get Student name
	 */
	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getAddress() {
		return address;
	}
	/**
	 * 
	 * @param address
	 * @return address of student
	 */

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhno() {
		return phno;
	}
	/**
	 * 
	 * @param phno
	 * @return student phone number
	 */

	public void setPhno(String phno) {
		this.phno = phno;
	}

	public String getGender() {
		return gender;
	}
	/**
	 * 
	 * @param gender 
	 */

	public void setGender(String gender) {
		this.gender = gender;
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

	public String getStatus() {
		return status;
	}
	/**
	 * 
	 * @param status
	 */

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", address=" + address + ", phno=" + phno + ", gender="
				+ gender + ", busno=" + busno + ", status=" + status + "]";
	}
	
	
	
}
