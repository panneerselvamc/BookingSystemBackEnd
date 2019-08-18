package com.bookingsystem.service;

import java.text.SimpleDateFormat;
import java.util.Date;
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
		
		String pattern = "yyyy-MM-dd";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		String date = simpleDateFormat.format(flightSearch.getDateOfTravel());
		return bookingSystemRepository.searchForFlight(flightSearch.getSourceAddress(), flightSearch.getDestination(),String.valueOf(date));
	}

}
