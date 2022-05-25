package com.devsuperior.dscatalog.dto;

import java.io.Serializable;
import java.time.Instant;

import com.devsuperior.dscatalog.entities.Category;

public class CategoryDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private Instant createdAt;
	
	public CategoryDTO() {
	}

	public CategoryDTO(Long id, String name, Instant createdAt) {
		this.id = id;
		this.name = name;
		this.setCreatedAt(createdAt);
	}

	public CategoryDTO(Category entity) {
		id = entity.getId();
		name = entity.getName(); 
		setCreatedAt(entity.getCreatedAt());
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Instant getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Instant createdAt) {
		this.createdAt = createdAt;
	}

	
}
