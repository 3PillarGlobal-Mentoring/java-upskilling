package com.pillarglobal.javaupskilling.model;

import java.util.Date;

public class Data {
	private Integer id;
	private String name;
	private Date creationDate;
	private Integer area;
	
	public Data() {
		
	}
	
	public Data(Integer id, String name, Date creationDate, Integer area) {
		this.id = id;
		this.name = name;
		this.creationDate = creationDate;
		this.setArea(area);
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Integer getArea() {
		return area;
	}

	public void setArea(Integer area) {
		this.area = area;
	}

}
