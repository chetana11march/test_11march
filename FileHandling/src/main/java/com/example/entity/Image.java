package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;

@Entity
public class Image {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;
	
	private String type; //application/jpg
	
	@Lob //large column
	private byte[] imageDetails;

	public Image() {
		super();
	}

	public Image(String name, String type, byte[] imageDetails) {
		super();
		this.name = name;
		this.type = type;
		this.imageDetails = imageDetails;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public byte[] getImageDetails() {
		return imageDetails;
	}

	public void setImageDetails(byte[] imageDetails) {
		this.imageDetails = imageDetails;
	}

	@Override
	public String toString() {
		return "Image [id=" + id + ", name=" + name + ", type=" + type + ", imageDetails=" + imageDetails + "]";
	}
	
	
	
	
	
}
