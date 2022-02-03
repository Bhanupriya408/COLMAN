package com.mph.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Route {

	@Id
	private int rid;
	private int busno;
	private String location;
	private String starttime;
	private String reachtime;
	
	public Route() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Route(int rid, int busno, String location, String starttime, String reachtime) {
		super();
		this.rid = rid;
		this.busno = busno;
		this.location = location;
		this.starttime = starttime;
		this.reachtime = reachtime;
	}

	public int getRid() {
		return rid;
	}

	public void setRid(int rid) {
		this.rid = rid;
	}

	public int getBusno() {
		return busno;
	}

	public void setBusno(int busno) {
		this.busno = busno;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getStarttime() {
		return starttime;
	}

	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}

	public String getReachtime() {
		return reachtime;
	}

	public void setReachtime(String reachtime) {
		this.reachtime = reachtime;
	}

	@Override
	public String toString() {
		return "Route [rid=" + rid + ", busno=" + busno + ", location=" + location + ", starttime=" + starttime
				+ ", reachtime=" + reachtime + "]";
	}
	
	
	
}
