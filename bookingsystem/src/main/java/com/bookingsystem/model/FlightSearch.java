package com.bookingsystem.model;

public class FlightSearch {
	private String sourceAddress;

	public String getSourceAddress() {
		return sourceAddress;
	}

	public void setSourceAddress(String sourceAddress) {
		this.sourceAddress = sourceAddress;
	}

	private String destination;
	private String dateOfTravel;
	private String transportType;
	private String transportClass;

	public String getTransportClass() {
		return transportClass;
	}

	public void setTransportClass(String transportClass) {
		this.transportClass = transportClass;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getDateOfTravel() {
		return dateOfTravel;
	}

	public void setDateOfTravel(String dateOfTravel) {
		this.dateOfTravel = dateOfTravel;
	}

	public String getTransportType() {
		return transportType;
	}

	public void setTransportType(String transportType) {
		this.transportType = transportType;
	}

}
