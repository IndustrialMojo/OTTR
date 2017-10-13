package com.industrialmojo.ottr

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

@RestController
public class OttrAthleteContoller {

	@Autowired
	private OttrAthleteRepository repository

	@RequestMapping("/ottr")
	public String index() {
		return "Greetings from the otter!"
	}

	@RequestMapping(path = "/ottr/all")
	public @ResponseBody Iterable<Athlete> getAllAthletes() {
		return repository.findAll()
	}
}