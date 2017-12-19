package com.industrialmojo.ottr.athlete

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

import com.industrialmojo.ottr.entity.Athlete

@RestController
public class OttrAthleteContoller {

	@Autowired
	private OttrAthleteRepository repository

	@RequestMapping("/ottr")
	public String index() {
		"Greetings from the otter!"
	}

	@RequestMapping(path = "/ottr/all")
	public @ResponseBody Iterable<Athlete> getAllAthletes() {
		repository.findAll()
	}
}