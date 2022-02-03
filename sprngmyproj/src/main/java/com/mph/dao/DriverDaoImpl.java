package com.mph.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mph.entity.Driver;
import com.mph.entity.Student;

@Repository
public class DriverDaoImpl implements DriverDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	protected Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	
	@Override
	public void addDriver(Driver driver) {
		// TODO Auto-generated method stub
		getSession().saveOrUpdate(driver);
		System.out.println("Driver added successfully...");

	}

	@Override
	public List<Driver> getAllDriver() {
		// TODO Auto-generated method stub
		Query qry = getSession().createQuery("select d from Driver d");
		List<Driver> dvrlist = qry.list();
		System.out.println("driver list from dao : " + dvrlist);
		return dvrlist;
		
	}

	@Override
	public List<Driver> updateDriver(Driver driver) {
		// TODO Auto-generated method stub
		Query qry = getSession()
				.createQuery(" update Driver d set dname=:dname,phno=:phno,address=:address,busno=:busno  where did=:did");
		qry.setParameter("dname", driver.getDname());
		qry.setParameter("phno", driver.getPhno());
		qry.setParameter("address",driver.getAddress());
		qry.setParameter("busno",driver.getBusno());
		qry.setParameter("did", driver.getDid());
		
		int noofrows = qry.executeUpdate();
		if (noofrows > 0) {
			System.out.println("Updated " + noofrows + " rows. ");
		}
		return getAllDriver();
	}

	@Override
	public List<Driver> deleteDriver(int did) {
		// TODO Auto-generated method stub
		Query qry = getSession().createQuery(" delete Driver  d where did=:did");
		qry.setParameter("did", did);
		int noofrows = qry.executeUpdate();
		if (noofrows > 0) {
			System.out.println("Deleted " + noofrows + " rows. ");
		}
		return getAllDriver();
	}

	@Override
	public Driver getDriver(int id) {
		// TODO Auto-generated method stub
		Query qry = getSession().createQuery("from Driver d where did=:id");
		qry.setParameter("id", id);
		Driver dvr = (Driver) qry.uniqueResult();
		System.out.println("search result : " + dvr);
		return dvr;	
	}

}
