package com.industrialmojo.ottr.event.impl

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

import com.industrialmojo.ottr.entity.Event
import com.industrialmojo.ottr.event.OttrEventRepository
import com.industrialmojo.ottr.event.OttrEventService

@Service
public class OttrEventServiceImpl implements OttrEventService {

	@Autowired
	private OttrEventRepository repository

	@Override
	public Iterable<Event> findAllOrderByDistanceStrokeAsc() {
		repository.findAllOrderByDistanceStrokeAsc()
	}
}