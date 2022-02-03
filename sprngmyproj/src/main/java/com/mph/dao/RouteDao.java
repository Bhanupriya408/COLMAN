package com.mph.dao;

import java.util.List;

import com.mph.entity.Route;

public interface RouteDao {

	public Route getRoute(int rte);
	public List<Route> deleteRoute(int rte);
	public void addRoute(Route route);
	public List<Route> getAllRoute();
	public List<Route> updateRoute(Route route);
}
