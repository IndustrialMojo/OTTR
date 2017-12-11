package com.industrialmojo.ottr.result

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

import com.industrialmojo.ottr.chartist.ChartistResponse
import com.industrialmojo.ottr.chartist.LineWithArea
import com.industrialmojo.ottr.chartist.Series
import com.industrialmojo.ottr.entity.Result

@RestController
public class OttrResultContoller {

	@Autowired
	private OttrResultRepository repository

	@RequestMapping("/ottr/result")
	public String index() {
		return "Greetings from the otter!"
	}

	//	@CrossOrigin(origins = "http://localhost:9000")
	@CrossOrigin
	@RequestMapping(path = "/ottr/result/all")
	public @ResponseBody Iterable<Result> getAllResults() {
		return repository.findAll()
	}

	@CrossOrigin
	@RequestMapping(path = "/ottr/result/event")
	public @ResponseBody Iterable<Result> getResultsByEventId() {
		return repository.findByEventIdOrderByEventDateAsc(7)
	}

	@CrossOrigin
	@RequestMapping(path = "/ottr/chartist/result/event")
	public @ResponseBody ChartistResponse getChartistResultsByEventId() {
		ChartistResponse response = new ChartistResponse()
		Iterable<Result> results = repository.findByEventIdOrderByEventDateAsc(7)
		for (Result result : results) {
			Series series = new Series()
			series.value = result.result
			series.meta = result.getEventDate()
			response.lineWithArea.series << series
			response.lineWithArea.labels << result.getEventDate()
		}
		return response
	}
}