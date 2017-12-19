package com.industrialmojo.ottr.result

import com.industrialmojo.ottr.chartist.ChartistResponse

public interface OttrResultService {
	ChartistResponse findChartistResultByEventId(Integer Eventid)
}