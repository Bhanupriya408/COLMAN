package com.mph.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mph.dao.RouteDao;
import com.mph.entity.Route;
@Service
@Transactional
public class RouteServiceImpl implements RouteService{

	@Autowired
	public RouteDao routeDao;
	
	@Override
	public Route getRoute(int id) {
		// TODO Auto-generated method stub
		return routeDao.getRoute(id);
	}

	@Override
	public List<Route> deleteRoute(int rid) {
		// TODO Auto-generated method stub
		return routeDao.deleteRoute(rid);
	}

	@Override
	public void addRoute(Route route) {
		// TODO Auto-generated method stub
		routeDao.addRoute(route);
	}

	@Override
	public List<Route> getAllRoute() {
		// TODO Auto-generated method stub
		return routeDao.getAllRoute();
	}

	@Override
	public List<Route> updateRoute(Route route) {
		// TODO Auto-generated method stub
		return routeDao.updateRoute(route);
	}

}
