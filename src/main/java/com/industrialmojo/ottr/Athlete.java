package com.industrialmojo.ottr;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "OTTR_ATHLETE")
public class Athlete {

	@Id
	@Column(name = "id")
	private byte[] id;

	@OneToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "PERSON_ID", nullable = true)
	private Person person;

	public byte[] getId() {
		return id;
	}

	public void setId(byte[] id) {
		this.id = id;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
}