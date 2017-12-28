package com.industrialmojo.ottr.entity

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.EnumType
import javax.persistence.Enumerated
import javax.persistence.FetchType
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.OneToOne
import javax.persistence.Table

import com.industrialmojo.ottr.datum.AgeGroup
import com.industrialmojo.ottr.datum.Gender
import com.industrialmojo.ottr.datum.TimeStandardKey

@Entity
@Table(name = 'OTTR_TIME_STANDARD')
class TimeStandard {

	@Id
	@Column(name = 'ID')
	Integer id

	@OneToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = 'EVENT_ID', nullable = true)
	Event event

	@Enumerated(EnumType.STRING)
	@Column(name = 'AGE_GROUP')
	AgeGroup ageGroup
	
	@Enumerated(EnumType.STRING)
	@Column(name = 'GENDER')
	Gender gender

	@Enumerated(EnumType.STRING)
	@Column(name = 'STANDARD_KEY')
	TimeStandardKey standardKey

	@Column(name = 'STANDARD')
	Float standard
}