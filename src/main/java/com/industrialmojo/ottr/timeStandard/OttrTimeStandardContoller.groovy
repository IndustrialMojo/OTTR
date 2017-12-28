package com.industrialmojo.ottr.timeStandard

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

import com.industrialmojo.ottr.chartist.ChartistResponse
import com.industrialmojo.ottr.entity.Result
import com.industrialmojo.ottr.timeStandard.impl.OttrTimeStandardServiceImpl

@RestController
public class OttrTimeStandardContoller {

	@Autowired
	private OttrTimeStandardServiceImpl service

	@RequestMapping("/ottr/timeStandard")
	public String index() {
		'Greetings from the otter!'
	}

	@CrossOrigin
	@RequestMapping(path = "/ottr/timeStandard/all")
	public @ResponseBody Iterable<Result> getAllTimeStandards() {
		service.findAll()
	}
}