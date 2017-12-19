package com.industrialmojo.ottr.chartist

import java.util.List

import com.fasterxml.jackson.annotation.JsonProperty

public class ChartistResponse {
	List<String> labels = new ArrayList<String>()
	List<List> series = new ArrayList<List>()
} 