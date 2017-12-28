package com.industrialmojo.ottr.timeStandard

import com.industrialmojo.ottr.entity.Result
import com.industrialmojo.ottr.entity.TimeStandard

public interface OttrTimeStandardService {
	Iterable<TimeStandard> findByResult(Result result)
	Iterable<TimeStandard> findAll()
}