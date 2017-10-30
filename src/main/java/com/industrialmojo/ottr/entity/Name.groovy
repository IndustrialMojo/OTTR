package com.industrialmojo.ottr.entity

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = 'NTT_NAME')
public class Name {

	@Id
	@Column(name = 'ID')
	Integer id

	@Column(name = 'FIRST')
	String first

	@Column(name = 'MIDDLE')
	String second

	@Column(name = 'LAST')
	String third

	@Column(name = 'NICKNAME')
	String nick

	@Column(name = 'PREFIX')
	String prefix

	@Column(name = 'SUFFIX')
	String suffix
}