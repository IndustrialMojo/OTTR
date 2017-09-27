package com.industrialmojo.movies;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Movies {

    @Id
    private Integer imdb;

    private String name;

    private String snakes;
    
    public Integer getImdb() {
		return imdb;
	}

	public void setImdb(Integer imdb) {
		this.imdb = imdb;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSnakes() {
		return snakes;
	}

	public void setSnakes(String snakes) {
		this.snakes = snakes;
	}
}