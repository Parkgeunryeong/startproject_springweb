package com.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.domain.Location;
import com.springboot.repository.LocationRepository;
@Service
public class LocationService {
	@Autowired
	private LocationRepository locationRepository;
	
	public List<Location> findlocation() {
		return locationRepository.findlocation();
	}

}
