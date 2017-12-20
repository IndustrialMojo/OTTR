package com.industrialmojo.ottr.event

import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

import com.industrialmojo.ottr.entity.Event

@RepositoryRestResource
public interface OttrEventRepository extends CrudRepository<Event, Integer> {

	@Query("SELECT e FROM Event e ORDER BY distance, stroke ASC")
	public List<Event> findAllOrderByDistanceStrokeAsc()
}