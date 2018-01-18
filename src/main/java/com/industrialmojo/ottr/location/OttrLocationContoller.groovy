package com.industrialmojo.ottr.location

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

import com.industrialmojo.ottr.entity.Event
import com.industrialmojo.ottr.location.impl.OttrLocationServiceImpl

@RestController
public class OttrLocationContoller {

	@Autowired
	private OttrLocationServiceImpl service

	@CrossOrigin
	@RequestMapping(path = "/ottr/location/city/all")
	public @ResponseBody Iterable<Event> getAllCities() {
		service.findAllCities()
	}
}