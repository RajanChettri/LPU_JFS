package com.example.demo;

public class Movie {

	private String id;
	private String name;
	private String description;
	
	// Default Constructor
	public Movie() {}
	
	public Movie( String id, String name, String description) {
		this.id=id;
		this.name=name;
		this.description = description;
	}
	
	// getters and setters for id, name and description
	public String getId() {return id;}
	public void setId(String id) { this.id=id;}
	
	public String getName() {return this.name;}
	public void setName(String name) { this.name=name;}
	
	public String getDesc() {return this.description;}
	public void setDesc(String desc) { this.description=desc;}
	
	
}
