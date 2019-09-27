package com.bookingsystem.bookingsystem;



import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.bookingsystem.model.FlightSearch;
import com.bookingsystem.repository.BookingSystemRepository;
import com.bookingsystem.service.BookingSystemServiceInterface;


@RunWith(SpringRunner.class)
@SpringBootTest

public class BookingsystemApplicationTests {

	@Test
	public void contextLoads() {	
		
	}
	@Test
	public void testBookingSystemServiceInterface() {
		BookingSystemServiceInterface bookingSystemServiceInterfaceMock=mock(BookingSystemServiceInterface.class);
		assertEquals(Arrays.asList(), bookingSystemServiceInterfaceMock.searchForFlight(new FlightSearch()));
		
	}

	@Test
	public void testBookingSystemRepository() {
		//Given
		BookingSystemRepository bookingSystemRepositoryMock=mock(BookingSystemRepository.class);
		//When
		when(bookingSystemRepositoryMock.searchForFlight(anyString(),anyString(),anyString())).thenReturn(null);
		//then
		assertEquals(null, bookingSystemRepositoryMock.searchForFlight("", "", ""));
		assertEquals(null, bookingSystemRepositoryMock.searchForFlight("india", "usa", "20-08-2019"));
		
	}
	
}



