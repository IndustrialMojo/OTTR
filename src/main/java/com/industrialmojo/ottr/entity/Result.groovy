package com.industrialmojo.ottr.entity

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.FetchType
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.OneToOne
import javax.persistence.Table

@Entity
@Table(name = 'OTTR_RESULT')
public class Result {

	@Id
	@Column(name = 'ID')
	Integer id

	@Column(name = 'RESULT')
	Integer result

	@OneToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = 'MEET_ID', nullable = true)
	Meet meet

	@OneToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = 'EVENT_ID', nullable = true)
	Event event

	@OneToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = 'ROSTER_ENTRY_ID', nullable = true)
	RosterEntry rosterEntry
}