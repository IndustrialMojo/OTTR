package com.industrialmojo.ottr.entity

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.EnumType
import javax.persistence.Enumerated
import javax.persistence.Id
import javax.persistence.Table

import org.hibernate.annotations.Type

import com.industrialmojo.ottr.datum.CourseType
import com.industrialmojo.ottr.datum.Distance
import com.industrialmojo.ottr.datum.Stroke

@Entity
@Table(name = 'OTTR_EVENT')
public class Event {

	@Id
	@Column(name = 'ID')
	Integer id

	@Enumerated(EnumType.STRING)
	@Column(name = 'DISTANCE')
	Distance distance

	@Enumerated(EnumType.STRING)
	@Column(name = 'STROKE')
	Stroke stroke

	@Enumerated(EnumType.STRING)
	@Column(name = 'COURSE_TYPE')
	CourseType courseType

	@Type(type = 'yes_no')
	@Column(name = 'IS_RELAY')
	Boolean isRelay
	
	String getDistance() {
		distance.distance
	}
}