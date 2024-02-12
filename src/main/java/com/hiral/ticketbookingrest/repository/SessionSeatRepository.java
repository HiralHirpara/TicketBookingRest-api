package com.hiral.ticketbookingrest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hiral.ticketbookingrest.model.Movie;
import com.hiral.ticketbookingrest.model.SessionSeat;

@Repository
public interface SessionSeatRepository extends JpaRepository<Movie,Long>{

	
	List<SessionSeat> saveAll(List<SessionSeat> sessionSeats);
	
//	@Query(value="select * from BOOKING b where b.user_id = :userId", nativeQuery=true)
//	List<Booking> findByUserId(@Param("userId") Long userId);
	
	
}
