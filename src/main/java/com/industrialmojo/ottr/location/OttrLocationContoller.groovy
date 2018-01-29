package com.industrialmojo.ottr.location

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

import com.industrialmojo.ottr.chartist.ChartistResponse
import com.industrialmojo.ottr.entity.CityState
import com.industrialmojo.ottr.location.impl.OttrLocationServiceImpl

@RestController
public class OttrLocationContoller {

	@Autowired
	private OttrLocationServiceImpl service

	@CrossOrigin
	@RequestMapping(path = "/ottr/location/city/all")
	public @ResponseBody Iterable<CityState> findCitiesAlpha() {
		service.findCitiesAlpha()
	}

	@CrossOrigin
	@RequestMapping(path = "/ottr/location/city/state")
	public @ResponseBody Iterable<CityState> findCitiesByStateAlpha(@RequestParam('state') String state) {
		service.findCitiesByStateAlpha(state)
	}
}