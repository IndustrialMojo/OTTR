package com.industrialmojo.ottr

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "NTT_PERSON")
class Person {

	@Id
	@Column(name = "id")
	byte[] id
}