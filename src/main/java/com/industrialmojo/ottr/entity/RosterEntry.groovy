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

import com.industrialmojo.ottr.datum.Grade

@Entity
@Table(name = 'OTTR_ROSTER_ENTRY')
public class RosterEntry {

	@Id
	@Column(name = 'ID')
	Integer id

	@Enumerated(EnumType.STRING)
	@Column(name = 'GRADE')
	Grade grade

	@OneToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = 'ATHLETE_ID', nullable = true)
	Athlete athlete

	@OneToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = 'ROSTER_ID', nullable = true)
	Roster roster
}