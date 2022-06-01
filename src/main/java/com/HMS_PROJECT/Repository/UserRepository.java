package com.HMS_PROJECT.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.HMS_PROJECT.Entity.BookingForm;
import com.HMS_PROJECT.Entity.User;


public interface UserRepository extends JpaRepository<User, Long>
{
	@Query("Select u from User u where u.email=?1")
	public User findByEmail(String email);

	public void save(BookingForm book);


}
