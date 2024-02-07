package com.hiral.ticketbookingrest.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
@Table(name = "cinema")
public class Cinema {
	
	@Id
	@GeneratedValue
	private int id;
	
	private String name;
	
	@OneToMany(mappedBy = "cinema")
	private List<CinemaRoom> cinemaRooms;
	
	@OneToOne
	private City cityId;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<CinemaRoom> getCinemaRooms() {
		return cinemaRooms;
	}

	public void setCinemaRooms(List<CinemaRoom> cinemaRooms) {
		this.cinemaRooms = cinemaRooms;
	}

	public City getCityId() {
		return cityId;
	}

	public void setCityId(City cityId) {
		this.cityId = cityId;
	}
	
	
	

}
