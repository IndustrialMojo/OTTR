package com.industrialmojo.ottr.timeStandard.impl

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

import com.industrialmojo.ottr.datum.AgeGroup
import com.industrialmojo.ottr.datum.Gender
import com.industrialmojo.ottr.entity.Result
import com.industrialmojo.ottr.entity.TimeStandard
import com.industrialmojo.ottr.timeStandard.OttrTimeStandardRepository
import com.industrialmojo.ottr.timeStandard.OttrTimeStandardService

@Service
public class OttrTimeStandardServiceImpl implements OttrTimeStandardService {

	@Autowired
	private OttrTimeStandardRepository repository

	@Override
	public Iterable<TimeStandard> findByResult(Result result) {
		Integer eventId = result.event.id
		AgeGroup ageGroup = AgeGroup.findByAge(result.rosterEntry.athlete.person.age)
		Gender gender = result.rosterEntry.athlete.person.gender
		repository.findByEventIdAndAgeGroupAndGender(eventId, ageGroup, gender)
	}

	@Override
	public Iterable<TimeStandard> findAll() {
		repository.findAll()
	}
}