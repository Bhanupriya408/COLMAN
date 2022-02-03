package com.mph.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mph.dao.DriverDao;
import com.mph.entity.Driver;
import com.mph.entity.Student;

@Service
@Transactional
public class DriverServiceImpl implements DriverService {

	@Autowired
	public DriverDao driverDao;
	
	@Override
	public void addDriver(Driver driver) {
		// TODO Auto-generated method stub
		driverDao.addDriver(driver);
	}

	@Override
	public List<Driver> getAllDriver() {
		// TODO Auto-generated method stub
		return driverDao.getAllDriver();
	}

	@Override
	public List<Driver> updateDriver(Driver driver) {
		// TODO Auto-generated method stub
		return driverDao.updateDriver(driver);
	}

	@Override
	public List<Driver> deleteDriver(int did) {
		// TODO Auto-generated method stub
		return driverDao.deleteDriver(did);
	}
	@Override
	public Driver getDriver(int id) {
		// TODO Auto-generated method stub
		return driverDao.getDriver(id);
	}

}
