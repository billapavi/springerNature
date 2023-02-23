package com.springer.travel.service;

import com.springer.travel.Trip;

public class MaharastraFailCalulation implements FairCalculator{

	public int DEFAULT_FAIR = 750;
	public int MULTIPLICATION_FACTOR = 5;
	
	@Override
	public double calculateFair(Trip trip) {
		// Basic calculate first 100 ks range  
		double fare = trip.getTraveller() * DEFAULT_FAIR;
		
		if( trip.getDistance() > DEFAULT_DISTANCE) {
			// Here we need to calculate actual logic
			int remainingDistance = trip.getDistance()-DEFAULT_DISTANCE;
			
			fare = (fare + remainingDistance * MULTIPLICATION_FACTOR) * trip.getTraveller();
				
		}
		
		return fare;
	}

}
