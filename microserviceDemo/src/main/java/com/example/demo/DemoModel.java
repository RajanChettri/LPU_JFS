package com.example.demo;

public class DemoModel {

	private int max;
	private int min;
	// Default Constructor
	public DemoModel() {}
	
	//getters and setters
	public int getMax() {return max;}
	public int getMin() {return min;}
	
	// constructor to set the fields
	public DemoModel(int max,int min) {
		this.max=max;
		this .min=min;
	}
}
