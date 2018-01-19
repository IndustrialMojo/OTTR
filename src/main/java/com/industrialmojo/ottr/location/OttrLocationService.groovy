package com.industrialmojo.ottr.location

import com.industrialmojo.ottr.entity.CityState

public interface OttrLocationService {
	Iterable<CityState> findCitiesAlpha()
	Iterable<CityState> findCitiesByStateAlpha(String state)
}