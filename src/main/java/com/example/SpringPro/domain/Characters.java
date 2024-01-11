package com.example.SpringPro.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity(name="characters")
public class  Characters {
	
	private long id;
	private String name;
	private String fandom;
	private String title; 
	
	public Characters() {
		
	}
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFandom() {
		return fandom;
	}

	public void setFandom(String fandom) {
		this.fandom = fandom;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}
	