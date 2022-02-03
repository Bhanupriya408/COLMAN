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

import com.mph.entity.Driver;
import com.mph.entity.Student;
import com.mph.service.DriverService;

@Controller
@RestController
@RequestMapping("/driver")
@CrossOrigin(allowCredentials = "false",allowedHeaders =  "*"  ,origins = "http://localhost:4200",methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE} )
public class DriverRestController {

	@Autowired
	public DriverService driverService;
	
	@PostMapping("/addDvr")
	public Driver addDriver(@RequestBody Driver driver) {
		driverService.addDriver(driver);
		return driver;
	}
	
	@PutMapping("/updateDvr")
	public ResponseEntity<List<Driver>> updateDriver(@RequestBody Driver driver) {
		List<Driver> li = driverService.updateDriver(driver);
		
		if (li.isEmpty()) {
			return new ResponseEntity<List<Driver>>(HttpStatus.NO_CONTENT);
		}

		return new ResponseEntity<List<Driver>>(li,HttpStatus.OK);
	}
	
	@GetMapping("/dvrlist")
	public ResponseEntity<List<Driver>> listAllDrivers() {
		List<Driver> li = driverService.getAllDriver();
		if (li.isEmpty()) {
			return new ResponseEntity<List<Driver>>(HttpStatus.NO_CONTENT);
		}

		return new ResponseEntity<List<Driver>>(li,HttpStatus.OK);
	}
	@RequestMapping("/dvrlist/{did}")
    public ResponseEntity<Driver> getDriver(@PathVariable("did") int id) {
      
		Driver driver = driverService.getDriver(id);
  	if (driver == null) {
			return new ResponseEntity<Driver>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<Driver>(driver,HttpStatus.OK);

	}
	@DeleteMapping("/deleteDvr/{id}")
	public ResponseEntity<List<Driver>> deleteDriver(@PathVariable("id") int did) {
		List<Driver> li = driverService.deleteDriver(did);
		if (li.isEmpty()) {
			return new ResponseEntity<List<Driver>>(HttpStatus.NO_CONTENT);
		}

		return new ResponseEntity<List<Driver>>(li,HttpStatus.OK);
	}
}
