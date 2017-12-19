package com.industrialmojo.ottr.result

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

import com.industrialmojo.ottr.chartist.ChartistResponse
import com.industrialmojo.ottr.entity.Result
import com.industrialmojo.ottr.result.impl.OttrResultServiceImpl

@RestController
public class OttrResultContoller {

	@Autowired
	private OttrResultServiceImpl service

	@Autowired
	private OttrResultRepository repository

	@RequestMapping("/ottr/result")
	public String index() {
		'Greetings from the otter!'
	}

	//	@CrossOrigin(origins = "http://localhost:9000")
	@CrossOrigin
	@RequestMapping(path = "/ottr/result/all")
	public @ResponseBody Iterable<Result> getAllResults() {
		repository.findAll()
	}

	@CrossOrigin
	@RequestMapping(path = "/ottr/result/event")
	public @ResponseBody Iterable<Result> getResultsByEventId() {
		repository.findByEventIdOrderByEventDateAsc(7)
	}

	@CrossOrigin
	@RequestMapping(path = "/ottr/chartist/result/event")
	public @ResponseBody ChartistResponse findChartistResultsByEventId() {
		service.findChartistResultByEventId(3)
	}
}