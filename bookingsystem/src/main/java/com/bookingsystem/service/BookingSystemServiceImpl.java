package com.bookingsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookingsystem.model.BookingSystemModel;
import com.bookingsystem.model.FlightSearch;
import com.bookingsystem.repository.BookingSystemRepository;

@Service
public class BookingSystemServiceImpl implements BookingSystemServiceInterface {
	@Autowired
	private BookingSystemRepository bookingSystemRepository;

	@Override
	public List<BookingSystemModel> searchForFlight(FlightSearch flightSearch) {
		System.out.println(flightSearch.getSourceAddress());
		return bookingSystemRepository.searchForFlight(flightSearch.getSourceAddress(), flightSearch.getDestination());
	}

}
