package com.industrialmojo.ottr.datum

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

import com.industrialmojo.ottr.entity.Event
import com.industrialmojo.ottr.event.impl.OttrEventServiceImpl

@RestController
public class DatumContoller {

	@Autowired
	private OttrEventServiceImpl service

	@CrossOrigin
	@RequestMapping(path = "/ottr/datum/states")
	public @ResponseBody Iterable<State> getAllStates() {
		Iterable<State> states = new ArrayList<String>()
		for (State state : State) {
			states << state
		}
		states
	}
}