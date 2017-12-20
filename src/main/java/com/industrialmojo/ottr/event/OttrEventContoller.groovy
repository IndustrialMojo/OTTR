package com.industrialmojo.ottr.event

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

import com.industrialmojo.ottr.entity.Event
import com.industrialmojo.ottr.event.impl.OttrEventServiceImpl

@RestController
public class OttrEventContoller {

	@Autowired
	private OttrEventServiceImpl service

	@CrossOrigin
	@RequestMapping(path = "/ottr/event/all")
	public @ResponseBody Iterable<Event> getAllResults() {
		service.findAllOrderByDistanceStrokeAsc()
	}
}