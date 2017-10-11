package com.industrialmojo.ottr;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface OttrAthleteRepository extends CrudRepository<Athlete, byte[]> {

}