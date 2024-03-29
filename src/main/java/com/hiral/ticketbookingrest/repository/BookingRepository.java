package com.hiral.ticketbookingrest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.hiral.ticketbookingrest.model.Booking;

@Repository
public interface BookingRepository extends JpaRepository<Booking,Long>{

	@Query(value="select * from BOOKING b where b.user_id = :userId", nativeQuery=true)
	List<Booking> findByUserId(@Param("userId") Long userId);
}
