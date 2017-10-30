package com.industrialmojo.ottr.athlete

import org.springframework.data.repository.CrudRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

import com.industrialmojo.ottr.entity.Athlete

@RepositoryRestResource
public interface OttrAthleteRepository extends CrudRepository<Athlete, Integer> {

}