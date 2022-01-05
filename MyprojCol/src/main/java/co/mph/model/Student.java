package co.mph.model;

public class Student {
	   private int sid;
	   private String sname;
	   private String address;
	   private String phno;
	public Student(int sid, String sname, String address, String phno) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.address = address;
		this.phno = phno;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhno() {
		return phno;
	}
	public void setPhno(String phno) {
		this.phno = phno;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", address=" + address + ", phno=" + phno + "]";
	}
	   
	   
}
