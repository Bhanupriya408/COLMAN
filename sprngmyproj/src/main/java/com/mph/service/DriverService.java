package com.mph.service;

import java.util.List;

import com.mph.entity.Driver;
import com.mph.entity.Student;

public interface DriverService {
	public Driver getDriver(int dvr);
	public List<Driver> deleteDriver(int dvr);
	public void addDriver(Driver driver);
	public List<Driver> getAllDriver();
	public List<Driver> updateDriver(Driver driver);

}
