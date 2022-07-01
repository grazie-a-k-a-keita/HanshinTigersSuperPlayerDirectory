package com.consallink.HanshinTigersSuperPlayerDirectory.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "player")
public class Player {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String position;
	private String facePicture;
	private String backNumber;
	private String leftAndRight;

	protected Player() {
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getPosition() {
		return position;
	}

	public String getFacePicture() {
		return facePicture;
	}

	public String getBackNumber() {
		return backNumber;
	}

	public String getLeftAndRight() {
		return leftAndRight;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public void setFacePicture(String facePicture) {
		this.facePicture = facePicture;
	}

	public void setBackNumber(String backNumber) {
		this.backNumber = backNumber;
	}

	public void setLeftAndRight(String leftAndRight) {
		this.leftAndRight = leftAndRight;
	}
}
