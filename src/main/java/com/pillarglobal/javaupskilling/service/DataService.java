package com.pillarglobal.javaupskilling.service;

import java.util.Date;

import org.springframework.stereotype.Service;

import com.pillarglobal.javaupskilling.model.Data;

@Service
public class DataService {
	
	public Data getData(int base, int altura) {
		return new Data(1000, "This is my name", new Date(), (base * altura));
	}
	
}
