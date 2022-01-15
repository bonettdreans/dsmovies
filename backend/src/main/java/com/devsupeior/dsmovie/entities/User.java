package com.devsupeior.dsmovie.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "tb_user")

public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String emmail;
	
	public User() {
	}

	public User(Long id, String emmail) {
		this.id = id;
		this.emmail = emmail;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmmail() {
		return emmail;
	}

	public void setEmmail(String emmail) {
		this.emmail = emmail;
	}
	
	
	
}
