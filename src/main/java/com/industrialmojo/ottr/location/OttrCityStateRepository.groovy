package com.industrialmojo.ottr.location

import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

import com.industrialmojo.ottr.entity.CityState
import com.industrialmojo.ottr.entity.Event

@RepositoryRestResource
public interface OttrCityStateRepository extends CrudRepository<CityState, Integer> {

	@Query("SELECT DISTINCT c FROM CityState c ORDER BY city ASC")
	public List<Event> findAllCityNames()
}