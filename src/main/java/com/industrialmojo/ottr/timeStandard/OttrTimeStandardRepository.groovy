package com.industrialmojo.ottr.timeStandard

import org.springframework.data.repository.CrudRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

import com.industrialmojo.ottr.datum.AgeGroup
import com.industrialmojo.ottr.datum.Gender
import com.industrialmojo.ottr.entity.TimeStandard

@RepositoryRestResource
public interface OttrTimeStandardRepository extends CrudRepository<TimeStandard, Integer> {
	List<TimeStandard> findByEventIdAndAgeGroupAndGender(Integer eventId, AgeGroup ageGroup, Gender gender)
}