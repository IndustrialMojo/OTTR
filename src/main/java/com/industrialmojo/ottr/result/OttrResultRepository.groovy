package com.industrialmojo.ottr.result

import org.springframework.data.repository.CrudRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

import com.industrialmojo.ottr.entity.Result

@RepositoryRestResource
public interface OttrResultRepository extends CrudRepository<Result, Integer> {
	List<Result> findByEventIdOrderByEventDateAsc(Integer eventId)
}