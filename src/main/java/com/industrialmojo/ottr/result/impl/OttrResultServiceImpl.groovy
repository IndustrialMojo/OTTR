package com.industrialmojo.ottr.result.impl

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

import com.industrialmojo.ottr.chartist.ChartistResponse
import com.industrialmojo.ottr.chartist.Series
import com.industrialmojo.ottr.entity.Result
import com.industrialmojo.ottr.entity.TimeStandard
import com.industrialmojo.ottr.result.OttrResultRepository
import com.industrialmojo.ottr.result.OttrResultService
import com.industrialmojo.ottr.timeStandard.impl.OttrTimeStandardServiceImpl

@Service
public class OttrResultServiceImpl implements OttrResultService {
	private final static String DELIM = ','

	@Autowired
	private OttrResultRepository repository

	@Autowired
	private OttrTimeStandardServiceImpl timeStandardService

	@Override
	public ChartistResponse findChartistResultByEventId(Integer eventId) {
		ChartistResponse response = new ChartistResponse()
		List<Series> seriesList = new ArrayList<Series>()
		Iterable<Result> results = repository.findByEventIdOrderByEventDateAsc(eventId)
		getTimeStandards(response, results)
		for (Result result : results) {
			response.labels << result.getEventDate()
			makeSeries(result, seriesList)
		}
		response.series << seriesList
		response
	}

	private void makeSeries(Result result, List<Series> seriesList) {
		Series series = new Series( value: result.result)
		makeSeriesMetaData(result, series)
		seriesList << series
	}

	private void makeSeriesMetaData(Result result, Series series) {
		StringBuilder sb = new StringBuilder()
		sb.append(result.getEventDate())
		sb.append(DELIM)
		sb.append(result.meet.getMeetName())
		if (result.meet.pool.name) {
			sb.append(DELIM)
			sb.append(result.meet.pool.name)
		}
		sb.append(DELIM)
		sb.append(result.meet.pool.location.description)
		sb.append(DELIM)
		sb.append(result.getFormattedResult())
		series.meta = sb.toString()
	}

	private TimeStandard getTimeStandards(ChartistResponse response, Iterable<Result> results) {
		if (results.size) {
			Iterable<TimeStandard> timeStandards = timeStandardService.findByResult(results[0])
			for (TimeStandard timeStandard : timeStandards) {
				List<Series> seriesList = new ArrayList<Series>()
				int yyz = (results.size() > 1) ? results.size() : 2
				for (yyz; yyz > 0; yyz--) {
					Series series = new Series( value: timeStandard.standard)
					seriesList << series
				}
				response.series << seriesList
			}
		}
		null
	}
}