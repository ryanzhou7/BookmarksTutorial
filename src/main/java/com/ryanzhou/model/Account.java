package com.ryanzhou.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Account {

	@Id
	@GeneratedValue
	private Long id;
	
	private String username;
	private String location;
	
	public String getLocation() {
		return location;
	}
	@JsonIgnore
	private String password;
	
	//@OneToMany(mappedBy="account")
	//private Set<Bookmark> bookmarks = new HashSet<>();
	
	public Account() { } //need for JPA
	public Account(final String username, final String password, final String location) {
		this.username = username;
		this.password = password;
		this.location = location;
	}
//	public Set<Bookmark> getBookmarks() {
//		return bookmarks;
//	}
	public Long getId() {
		return id;
	}
	public String getPassword() {
		return password;
	}
	public String getUsername() {
		return username;
	}	
	
}
