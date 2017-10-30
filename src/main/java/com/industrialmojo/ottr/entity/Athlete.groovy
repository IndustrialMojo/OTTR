package com.industrialmojo.ottr.entity

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.FetchType
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.OneToOne
import javax.persistence.Table

@Entity
@Table(name = 'OTTR_ATHLETE')
public class Athlete {

	@Id
	@Column(name = 'ID')
	Integer id

	@OneToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = 'PERSON_ID', nullable = true)
	Person person
}