package com.industrialmojo.ottr.result

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

import com.industrialmojo.ottr.entity.Athlete

@RestController
public class OttrResultContoller {

	@Autowired
	private OttrResultRepository repository

	@RequestMapping("/ottr/result")
	public String index() {
		return "Greetings from the otter!"
	}

	@CrossOrigin
	@RequestMapping(path = "/ottr/result/all")
	public @ResponseBody Iterable<Athlete> getAllResults() {
		return repository.findAll()
	}
}