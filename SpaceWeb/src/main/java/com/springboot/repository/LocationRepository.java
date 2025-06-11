package com.springboot.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.springboot.domain.Location;

@Repository
public class LocationRepository {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<Location> findlocation() {
		String sql = "SELECT * FROM location ORDER BY id ASC";
		
		return jdbcTemplate.query(sql, (rs, rowNum) -> {
            Location location = new Location();
            location.setId(rs.getInt("id"));
            location.setName(rs.getString("name"));
            location.setLatitude(rs.getBigDecimal("latitude"));
            location.setLongitude(rs.getBigDecimal("longitude"));
            return location;
		});

		
	}
	

}
