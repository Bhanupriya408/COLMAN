package com.mph.service;

import java.util.List;

import com.mph.entity.Route;

public interface RouteService {

	public Route getRoute(int rte);
	public List<Route> deleteRoute(int rte);
	public void addRoute(Route route);
	public List<Route> getAllRoute();
	public List<Route> updateRoute(Route route);
}
