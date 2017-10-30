package com.industrialmojo.ottr.entity

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = 'OTTR_MEET_NAME')
public class MeetName {

	@Id
	@Column(name = 'ID')
	Integer id

	@Column(name = 'NAME')
	String name
}