package com.consallink.HanshinTigersSuperPlayerDirectory.model;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "player_comment")
public class PlayerComment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int playerId;
	private String context;
	private Timestamp createAt;
	private String myContext;

	public int getId() {
		return id;
	}

	public int getPlayerId() {
		return playerId;
	}

	public String getContext() {
		return context;
	}

	public Timestamp getCreateAt() {
		return createAt;
	}

	public String getMyContext() {
		return myContext;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public void setContext(String context) {
		this.context = context;
	}

	public void setCreateAt(Timestamp createAt) {
		this.createAt = createAt;
	}

	public void setMyContext(String myContext) {
		this.myContext = myContext;
	}
}
