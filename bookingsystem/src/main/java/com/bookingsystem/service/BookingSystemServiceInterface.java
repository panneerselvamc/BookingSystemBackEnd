package com.bookingsystem.service;

import java.util.List;

import com.bookingsystem.model.BookingSystemModel;
import com.bookingsystem.model.FlightSearch;

public interface BookingSystemServiceInterface {

	public List<BookingSystemModel> searchForFlight(FlightSearch flightSearch);
}
