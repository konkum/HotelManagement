package com.HMS_PROJECT.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.HMS_PROJECT.Entity.BookingForm;
import com.HMS_PROJECT.Entity.User;
import com.HMS_PROJECT.Repository.UserRepository;




@Controller
public class UserController {
	
	@Autowired
	private UserRepository urepo;
	
	@RequestMapping("/")
	public String index() {
		return "index"; 
	}
	
	@RequestMapping("/userlogin")
	public String index1(Model model) {
		model.addAttribute("user", new User());
		return "userlogin";
	}
	
	@GetMapping("/signup")
	public String index2(Model model) {
		model.addAttribute("user", new User());
		return "Registration";
	}
	
	@PostMapping("/process_register")
	public String index3(User user) {
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String encodePassword = passwordEncoder.encode(user.getPassword());
		user.setPassword(encodePassword);
		urepo.save(user);
		return "userlogin";
	}
	
	@RequestMapping("/hotelbooking")
	public String index4(Model model) {
		model.addAttribute("bookform", new BookingForm());
		return "HotelBookingForm";
	}
	
	@PostMapping("/save")
	public String index5(BookingForm bookform) {
		urepo.save(bookform);
		return "index";
	}
	

	
	

}

