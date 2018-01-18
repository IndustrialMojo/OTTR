package com.industrialmojo.ottr.location

import com.industrialmojo.ottr.entity.CityState

public interface OttrLocationService {
	Iterable<CityState> findAllCities()
}