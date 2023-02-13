package com.codingdojo.project.captainTest.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.project.captainTest.models.Bookings;
import com.codingdojo.project.captainTest.repositories.BookingRepository;

@Service
public class BookingService {
 private final BookingRepository bRepo;
 //Instantiates the Repository
 public BookingService(BookingRepository bRepo) {
	 this.bRepo = bRepo;
 }
 //Grabs all bookings
 public List<Bookings> allBookings(){
	 return bRepo.findAll();
 }
 //Saves the inserted information
 public Bookings createBooking (Bookings b) {
	 return bRepo.save(b);
 }
 //Deletes the information in the DB by the ID
 public void deleteById(Long id) {
	 bRepo.deleteById(id);
 }
 //Checks is there is a booking present, Else Returns null to avoid input errors
 public Bookings findBooking(Long id) {
	 Optional<Bookings> optionalBookings = bRepo.findById(id); 
	 if(optionalBookings.isPresent()) {
		 return optionalBookings.get();
		 } 
	  else {
			return null; 
		 }
 }
 
}
