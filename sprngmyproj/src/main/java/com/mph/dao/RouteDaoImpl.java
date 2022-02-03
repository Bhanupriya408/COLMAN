package com.mph.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.mph.entity.Route;

public class RouteDaoImpl implements RouteDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	protected Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	
	@Override
	public Route getRoute(int id) {
		// TODO Auto-generated method stub
		Query qry = getSession().createQuery("from Route r where rid=:id");
		qry.setParameter("id", id);
		Route rte = (Route) qry.uniqueResult();
		System.out.println("search result : " + rte);
		return rte;	
	}

	@Override
	public List<Route> deleteRoute(int rid) {
		// TODO Auto-generated method stub
		Query qry = getSession().createQuery(" delete Route  r where rid=:rid");
		qry.setParameter("rid", rid);
		int noofrows = qry.executeUpdate();
		if (noofrows > 0) {
			System.out.println("Deleted " + noofrows + " rows. ");
		}
		return getAllRoute ();
	}

	@Override
	public void addRoute(Route route) {
		// TODO Auto-generated method stub
		getSession().saveOrUpdate(route);
		System.out.println("Route added successfully...");

	}

	@Override
	public List<Route> getAllRoute() {
		// TODO Auto-generated method stub
		Query qry = getSession().createQuery("select r from Route r");
		List<Route> rtelist = qry.list();
		System.out.println("route list from dao : " +rtelist);
		return rtelist;
	}

	@Override
	public List<Route> updateRoute(Route route) {
		// TODO Auto-generated method stub
		Query qry = getSession()
				.createQuery(" update Route r set busno=:busno,location=:location,starttime=:starttime,reachtime=:reachtime  where rid=:rid");
		qry.setParameter("location", route.getLocation());
		qry.setParameter("starttime", route.getStarttime());
		qry.setParameter("reachtime",route.getReachtime());
		qry.setParameter("busno",route.getBusno());
		qry.setParameter("rid", route.getRid());
		
		int noofrows = qry.executeUpdate();
		if (noofrows > 0) {
			System.out.println("Updated " + noofrows + " rows. ");
		}
		return getAllRoute();
	}


}
