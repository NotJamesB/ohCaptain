package com.codingdojo.project.captainTest.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.codingdojo.project.captainTest.models.Bookings;
import com.codingdojo.project.captainTest.services.BookingService;

@Controller
public class CaptainController {

	@Autowired
	BookingService bServ;
	
	@GetMapping("/")
	public String redirect() {
		return "index.jsp";
	}
	
	@GetMapping("/bookings/{id}")
	public String showBookingById(@PathVariable("id") Long id, Model model) {
		Bookings bookings = bServ.findBooking(id);
		model.addAttribute("booking", bookings);
		return "showOneBooking.jsp";
	}
	
	@GetMapping("/bookings/read")
	public String allBookings(Model model) {
		List<Bookings> bookings = bServ.allBookings();
		model.addAttribute("allBookings", bookings);
		return "allBookings.jsp";
	}
	
	@GetMapping("/bookings/new")
	public String newBooking(@ModelAttribute("booking")Bookings booking) {
		return "newBooking.jsp";
	}
	
	@PostMapping("/bookings/create")
	public String createBooking(@Valid @ModelAttribute("booking") Bookings booking, BindingResult result) {
        if (result.hasErrors()) {
            return "newBooking.jsp";
        } else {
            bServ.createBooking(booking);
            return "redirect:/bookings/read";
        }
	}

}
