package model.entities;

import java.io.Serializable;
import java.time.LocalDate;

import model.entities.enums.Status;

public class Task implements Serializable{
	private static final long serialVersionUID = 1L;
	private String id;
	private String description;
	private Status status;
	private LocalDate createdAt;
	private LocalDate updatedAt;
	
	
	public Task() {
	}


	public Task(String id, String description, LocalDate createdAt, LocalDate updatedAt) {
		this.id = id;
		this.description = description;
		this.status = Status.TO_DO;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public Status getStatus() {
		return status;
	}


	public void setStatus(Status status) {
		this.status = status;
	}


	public LocalDate getCreatedAt() {
		return createdAt;
	}


	public void setCreatedAt(LocalDate createdAt) {
		this.createdAt = createdAt;
	}


	public LocalDate getUpdatedAt() {
		return updatedAt;
	}


	public void setUpdatedAt(LocalDate updatedAt) {
		this.updatedAt = updatedAt;
	}


	@Override
	public String toString() {
		return "Task [id=" + id + ", description=" + description + ", status=" + status + ", createdAt=" + createdAt
				+ ", updatedAt=" + updatedAt + "]";
	}
	
	
}
