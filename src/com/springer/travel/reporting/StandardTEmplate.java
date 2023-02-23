package com.springer.travel.reporting;

import com.springer.travel.Trip;
import com.springer.travel.service.CalculateDistance;

public class StandardTEmplate implements Template {

	public Trip trip;
	@Override
	public void createHead() {
		// TODO Auto-generated method stub
		System.out.println(trip.getDestination());
	}

	@Override
	public void createTail() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createBody() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void build() {
		createHead();
		createBody();
		createTail();// total
		
	}

}
