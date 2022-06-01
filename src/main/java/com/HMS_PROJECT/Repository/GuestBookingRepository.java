package com.HMS_PROJECT.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.HMS_PROJECT.Entity.BookingForm;

public interface GuestBookingRepository extends JpaRepository<BookingForm, Integer>
{

	

}
