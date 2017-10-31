package com.industrialmojo.ottr.entity

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.FetchType
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.OneToOne
import javax.persistence.Table
import javax.persistence.Transient

import com.industrialmojo.ottr.util.TimeUtils

@Entity
@Table(name = 'OTTR_ROSTER')
public class Roster {

	@Id
	@Column(name = 'ID')
	Integer id

	@Transient
	private Long startYear

	@Transient
	private Long endYear

	@OneToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = 'TEAM_ID', nullable = true)
	Team team

	@Column(name = 'DESCRIPTION')
	String description

	@Column(name = 'START_DATE')
	private Long startDate

	@Column(name = 'END_DATE')
	private Long endDate

	String getStartYear() {
		TimeUtils.epochToYearString(startDate)
	}

	String getEndYear() {
		TimeUtils.epochToYearString(endDate)
	}

	String getStartDate() {
		TimeUtils.epochToDateString(startDate)
	}

	String getEndDate() {
		TimeUtils.epochToDateString(endDate)
	}
}