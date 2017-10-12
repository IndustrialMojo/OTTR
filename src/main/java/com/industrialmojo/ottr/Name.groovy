package com.industrialmojo.ottr

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.FetchType
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.OneToOne
import javax.persistence.Table

@Entity
@Table(name = "NTT_NAME")
public class Name {

	@Id
	@Column(name = "ID")
	byte[] id
	
	@Column(name = "FIRST")
	String first
	
	@Column(name = "SECOND")
	String second
	
	@Column(name = "THIRD")
	String third
	
	@Column(name = "NICK")
	String nick
	
	@Column(name = "PREFIX")
	String prefix
	
	@Column(name = "SUFFIX")
	String suffix
}