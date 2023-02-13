package com.codingdojo.project.captainTest.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="bookings")
public class Bookings {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull(message = "Please provide a name for the booking!")
	@Size(min = 2, max = 15, message = "Please provide a name between 2 and 15 characters")
	private String groupName;
	
	@NotNull(message = "Please provide a number of guests (Maxium of 8")
	@Min(value = 1)
	@Max(value = 8, message = "Do not exceed 8 guests...The boat is only so big!")
	private int numOfGuests;
	
	@NotNull(message = "Please provide a date (Only accepts Mon-Fri)")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date bookingDate;
	
	public Bookings() {};

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public int getNumOfGuests() {
		return numOfGuests;
	}

	public void setNumOfGuests(int numOfGuests) {
		this.numOfGuests = numOfGuests;
	}

	public Date getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}
	
	
}
