package com.codingdojo.project.captainTest.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.project.captainTest.models.Bookings;

@Repository
public interface BookingRepository extends CrudRepository<Bookings, Long> {
	List<Bookings> findAll();
}
