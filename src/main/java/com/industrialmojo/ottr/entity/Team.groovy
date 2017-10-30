package com.industrialmojo.ottr.entity

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.FetchType
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.OneToOne
import javax.persistence.Table

@Entity
@Table(name = 'OTTR_TEAM')
public class Team {

	@Id
	@Column(name = 'ID')
	Integer id

	@Column(name = 'NAME')
	String name

	@Column(name = 'NICKNAME')
	String nickName

	@OneToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = 'LOCATION_ID', nullable = true)
	Location location
}