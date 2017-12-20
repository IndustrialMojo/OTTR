package com.industrialmojo.ottr.result.impl

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

import com.industrialmojo.ottr.chartist.ChartistResponse
import com.industrialmojo.ottr.chartist.Series
import com.industrialmojo.ottr.entity.Result
import com.industrialmojo.ottr.result.OttrResultRepository
import com.industrialmojo.ottr.result.OttrResultService
import com.jayway.jsonpath.internal.function.json.Append

@Service
public class OttrResultServiceImpl implements OttrResultService {
	private final static String DELIM = ','

	@Autowired
	private OttrResultRepository repository

	@Override
	public ChartistResponse findChartistResultByEventId(Integer eventId) {
		ChartistResponse response = new ChartistResponse()
		response.series << new ArrayList<Series>()
		Iterable<Result> results = repository.findByEventIdOrderByEventDateAsc(eventId)
		for (Result result : results) {
			response.labels << result.getEventDate()
			makeSeries(result, response)
		}
		response
	}

	private void makeSeries(Result result, ChartistResponse response) {
		Series series = new Series( value: result.result)
		makeSeriesMetaData(result, series)
		response.series[0] << series
	}

	private void makeSeriesMetaData(Result result, Series series) {
		StringBuilder sb = new StringBuilder()
		sb.append(result.getEventDate())
		sb.append(DELIM)
		sb.append(result.meet.host.name)
		sb.append(DELIM)
		sb.append(result.meet.getYearAndName())
		sb.append(DELIM)
		sb.append(result.getFormattedResult())
		series.meta = sb.toString()
	}
}