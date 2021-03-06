package com.industrialmojo.ottr.entity

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.EnumType
import javax.persistence.Enumerated
import javax.persistence.Id
import javax.persistence.Table

import com.industrialmojo.ottr.datum.State

@Entity
@Table(name = 'NTT_CITY_STATE')
public class CityState {

	@Id
	@Column(name = 'ID')
	Integer id

	@Column(name = 'CITY')
	String city

	@Enumerated(EnumType.STRING)
	@Column(name = 'STATE')
	State state
}