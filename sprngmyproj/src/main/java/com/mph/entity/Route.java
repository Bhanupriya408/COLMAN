package com.mph.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
/**
 * 
 * @author abhishek
 *
 */
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
	/**
	 * 
	 * @param rid is the route Id
	 * @param busno
	 * @param location
	 * @param starttime
	 * @param reachtime
	 */

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
	/**
	 * 
	 * @param rid
	 */

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
	/**
	 * 
	 * @param location to get location of bus
	 */

	public void setLocation(String location) {
		this.location = location;
	}

	public String getStarttime() {
		return starttime;
	}
	/**
	 * 
	 * @param starttime to get what is the start time of bus
	 */

	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}

	public String getReachtime() {
		return reachtime;
	}
    /**
     * 
     * @param reachtime to get what is the reach time of bus
     */
	public void setReachtime(String reachtime) {
		this.reachtime = reachtime;
	}

	@Override
	public String toString() {
		return "Route [rid=" + rid + ", busno=" + busno + ", location=" + location + ", starttime=" + starttime
				+ ", reachtime=" + reachtime + "]";
	}
	
	
	
}
