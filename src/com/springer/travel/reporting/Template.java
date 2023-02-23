package com.springer.travel.reporting;

public interface Template {
	
	public void createHead();
	public void createTail();
	public void createBody();
	
	public void build() ;
	

}
