package com.pillarglobal.javaupskilling.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pillarglobal.javaupskilling.model.Data;
import com.pillarglobal.javaupskilling.service.DataService;

@RestController
@RequestMapping("/data")
public class DataController {
	
	private DataService service;
	
	@Autowired
	public DataController (DataService service) {
		this.service = service;
	}
	
	@GetMapping("/base/{base}/altura/{altura}")
	public Data getData(@PathVariable("base") Integer base, @PathVariable("altura") Integer altura) {
		return service.getData(base, altura);
	}

}
