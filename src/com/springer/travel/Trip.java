package com.springer.travel;

public class Trip implements GenericRoute{

	private Cities source;
	private Cities destination;
	private int traveller;
	private int distance;
	
	public Trip(Cities source, Cities destination, int traveller, int distance) {
		super();
		this.source = source;
		this.destination = destination;
		this.traveller = traveller;
		this.setDistance(distance);
	}
	
	
	
	public Cities getSource() {
		return source;
	}
	public void setSource(Cities source) {
		this.source = source;
	}
	public Cities getDestination() {
		return destination;
	}
	public void setDestination(Cities destination) {
		this.destination = destination;
	}
	public int getTraveller() {
		return traveller;
	}
	public void setTraveller(int traveller) {
		this.traveller = traveller;
	}


	public int getDistance() {
		return distance;
	}


	public void setDistance(int distance) {
		this.distance = distance;
	}
	
	
	
}
