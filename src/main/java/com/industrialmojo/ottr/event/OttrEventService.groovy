package com.industrialmojo.ottr.event

import com.industrialmojo.ottr.entity.Event

public interface OttrEventService {
	Iterable<Event> findAllOrderByDistanceStrokeAsc()
}