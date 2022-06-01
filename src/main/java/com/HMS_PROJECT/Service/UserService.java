package com.HMS_PROJECT.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HMS_PROJECT.Entity.BookingForm;
import com.HMS_PROJECT.Repository.GuestBookingRepository;
@Service
public class UserService 
{
	@Autowired
	private GuestBookingRepository guestepo;
    public List<BookingForm> guestdetailAll() {
        return guestepo.findAll();
    }
     

}
