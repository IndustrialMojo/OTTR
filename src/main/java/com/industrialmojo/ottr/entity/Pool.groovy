package com.industrialmojo.ottr.entity

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.FetchType
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.OneToOne
import javax.persistence.Table

@Entity
@Table(name = 'OTTR_POOL')
public class Pool {

	@Id
	@Column(name = 'ID')
	Integer id

	@Column(name = 'NAME')
	String name

	@OneToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = 'LOCATION_ID', nullable = true)
	Location location
}