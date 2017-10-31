package com.industrialmojo.ottr.entity

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.FetchType
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.OneToOne
import javax.persistence.Table

import com.industrialmojo.ottr.util.TimeUtils

@Entity
@Table(name = 'OTTR_MEET')
public class Meet {

	@Id
	@Column(name = 'ID')
	Integer id

	@Column(name = 'YYYY')
	private Date year

	@OneToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = 'NAME_ID', nullable = true)
	MeetName name

	@OneToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = 'POOL_ID', nullable = true)
	Pool pool

	@OneToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = 'HOST_ID', nullable = true)
	Team host

	@Column(name = 'START_DATE')
	private Long startDate

	@Column(name = 'END_DATE')
	private Long endDate
	
	String getYear() {
		TimeUtils.epochToYearString(startDate)
	}

	String getStartDate() {
		TimeUtils.epochToDateString(startDate)
	}

	String getEndDate() {
		TimeUtils.epochToDateString(endDate)
	}
}