package com.industrialmojo.ottr.location.impl

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

import com.industrialmojo.ottr.entity.CityState
import com.industrialmojo.ottr.location.OttrCityStateRepository
import com.industrialmojo.ottr.location.OttrLocationService

@Service
public class OttrLocationServiceImpl implements OttrLocationService {

	@Autowired
	private OttrCityStateRepository repository

	@Override
	public Iterable<CityState> findAllCities() {
		repository.findAll()
	}
}