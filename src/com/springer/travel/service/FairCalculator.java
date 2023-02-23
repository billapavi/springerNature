package com.springer.travel.service;

import com.springer.travel.Trip;

public interface FairCalculator {
	
	public int DEFAULT_DISTANCE = 100;
	
	public double calculateFair(Trip trip);
	

}
