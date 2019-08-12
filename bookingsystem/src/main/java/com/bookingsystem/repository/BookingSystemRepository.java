package com.bookingsystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.bookingsystem.model.BookingSystemModel;

public interface BookingSystemRepository extends JpaRepository<BookingSystemModel, Integer> {
	@Query(value = "select * from flight WHERE source_address=?1 and destination=?2", nativeQuery = true)
	public List<BookingSystemModel> searchForFlight(String sourceAddress, String destination);
}
