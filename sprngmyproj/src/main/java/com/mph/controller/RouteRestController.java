package com.mph.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.mph.entity.Route;
import com.mph.service.RouteService;

@Controller
@RestController
@RequestMapping("/route")
@CrossOrigin(allowCredentials = "false",allowedHeaders =  "*"  ,origins = "http://localhost:4200",methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE} )

public class RouteRestController {

	@Autowired
	public RouteService routeService;
	
	@PostMapping("/addRte")
	public Route addRoute(@RequestBody Route route) {
		routeService.addRoute(route);
		return route;
	}
	
	@PutMapping("/updateRte")
	public ResponseEntity<List<Route>> updateRoute(@RequestBody Route route) {
		List<Route> li = routeService.updateRoute(route);
		
		if (li.isEmpty()) {
			return new ResponseEntity<List<Route>>(HttpStatus.NO_CONTENT);
		}

		return new ResponseEntity<List<Route>>(li,HttpStatus.OK);
	}
	
	@GetMapping("/rtelist")
	public ResponseEntity<List<Route>> listAllRoutes() {
		List<Route> li = routeService.getAllRoute();
		if (li.isEmpty()) {
			return new ResponseEntity<List<Route>>(HttpStatus.NO_CONTENT);
		}

		return new ResponseEntity<List<Route>>(li,HttpStatus.OK);
	}
	@RequestMapping("/rtelist/{rid}")
    public ResponseEntity<Route> getRoute(@PathVariable("rid") int id) {
      
		Route route = routeService.getRoute(id);
  	if (route == null) {
			return new ResponseEntity<Route>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<Route>(route,HttpStatus.OK);

	}
	@DeleteMapping("/deleteRte/{id}")
	public ResponseEntity<List<Route>> deleteRoute(@PathVariable("id") int rid) {
		List<Route> li = routeService.deleteRoute(rid);
		if (li.isEmpty()) {
			return new ResponseEntity<List<Route>>(HttpStatus.NO_CONTENT);
		}

		return new ResponseEntity<List<Route>>(li,HttpStatus.OK);
	}
}
