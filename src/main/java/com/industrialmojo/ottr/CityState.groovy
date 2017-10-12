package com.industrialmojo.ottr

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.FetchType
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.OneToOne
import javax.persistence.Table

@Entity
@Table(name = "NTT_CITY_STATE")
public class CityState {

	@Id
	@Column(name = "ID")
	byte[] id
	
	@Column(name = "CITY")
	String city

	@Column(name = "STATE")
	String state
}