package com.industrialmojo.ottr.location.impl

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

import com.industrialmojo.ottr.datum.State
import com.industrialmojo.ottr.entity.CityState
import com.industrialmojo.ottr.location.OttrCityStateRepository
import com.industrialmojo.ottr.location.OttrLocationService

@Service
public class OttrLocationServiceImpl implements OttrLocationService {

	@Autowired
	private OttrCityStateRepository repository
	
	@Override
	public Iterable<CityState> findCitiesAlpha() {
		repository.findCitiesAlpha()
	}

	@Override
	public Iterable<CityState> findCitiesByStateAlpha(String state) {	
		State stateEnum = State.parse(state)
		repository.findCitiesByStateAlpha(state)
	}
}