package com.bookingsystem.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bookingsystem.model.*;
import com.bookingsystem.service.BookingSystemServiceInterface;

@RestController
@CrossOrigin
public class BookingSystemController {
	@Autowired
	private BookingSystemServiceInterface bookingSystemServiceInterface;

	@PostMapping(path = "/searchforflight")
	public @ResponseBody List<BookingSystemModel> searchForFlight(@RequestBody FlightSearch flightSearch) {
		return bookingSystemServiceInterface.searchForFlight(flightSearch);

	}
}
