package com.industrialmojo.ottr.location

import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

import com.industrialmojo.ottr.datum.State
import com.industrialmojo.ottr.entity.CityState

@RepositoryRestResource
public interface OttrCityStateRepository extends CrudRepository<CityState, Integer> {

	@Query("SELECT c FROM CityState c ORDER BY city ASC")
	public List<CityState> findCitiesAlpha()

//	@Query("SELECT c FROM CityState c where c.state = ?0 ORDER BY city ASC")
	@Query(value = "SELECT * FROM NTT_CITY_STATE c where c.state = ?1 ORDER BY c.city ASC",
		nativeQuery=true
	)
	List<CityState> findCitiesByStateAlpha(String state)
}