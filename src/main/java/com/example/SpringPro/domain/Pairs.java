package com.example.SpringPro.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name="natureluv")
public class  Pairs {
	
	private long id;
	private String first;
	private String second;
	private String pairname; 
	private String story;
	


	public Pairs() {

	}
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirst() {
		return first;
	}

	public void setFirst(String first) {
		this.first = first;
	}

	public String getSecond() {
		return second;
	}

	public void setSecond(String second) {
		this.second = second;
	}

	public String getPairname() {
		return pairname;
	}

	public void setPairname(String pairname) {
		this.pairname = pairname;
	}
	public String getStory() {
		return story;
	}


	public void setStory(String story) {
		this.story = story;
	}

}

	
	


