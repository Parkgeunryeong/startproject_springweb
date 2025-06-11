package com.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.springboot.service.LocationService;
import org.springframework.ui.Model;

import com.springboot.domain.Location;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class LocationController {
	@Autowired
	private LocationService locationService;
	
	@GetMapping("/locations")
    public String showLocations(Model model) {
        List<Location> locations = locationService.findlocation();
        model.addAttribute("locations", locations);
        return "location_page";  
    }
	@GetMapping("locationscore")
	public String showScore(Model model) {
		List<Location> locations = locationService.findlocation();
        model.addAttribute("locations", locations);
		return "score_home";
	}
	@GetMapping("/searchscore")
	public String searchscore(@RequestParam("lat") String lat,
                              @RequestParam("lon") String lon,
                              @RequestParam("name") String name,
                              Model model) {
		model.addAttribute("lat", lat);
		model.addAttribute("lon", lon);
		model.addAttribute("name", name);
		return "searchscore";
	}
	@GetMapping("locationscore2")
	public String showScore_score(Model model) {
		List<Location> locations = locationService.findlocation();
        model.addAttribute("locations", locations);
		return "score_home2";
	}
	
	
	

}
