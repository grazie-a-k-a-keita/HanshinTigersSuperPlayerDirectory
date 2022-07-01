package com.consallink.HanshinTigersSuperPlayerDirectory.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "defensive_performance")
public class DefensivePerformance {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private int playerId;
	private String defensivePosition;
	private String game;
	private String putOut;
	private String killing;
	private String error;
	private String doublePlay;
	private String passedBall;
	private String fieldingPercentage;

	protected DefensivePerformance() {
	}

	public int getId() {
		return id;
	}

	public int getPlayerId() {
		return playerId;
	}

	public String getDefensivePosition() {
		return defensivePosition;
	}

	public String getGame() {
		return game;
	}

	public String getPutOut() {
		return putOut;
	}

	public String getKilling() {
		return killing;
	}

	public String getError() {
		return error;
	}

	public String getDoublePlay() {
		return doublePlay;
	}

	public String getPassedBall() {
		return passedBall;
	}

	public String getFieldingPercentage() {
		return fieldingPercentage;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public void setDefensivePosition(String defensivePosition) {
		this.defensivePosition = defensivePosition;
	}

	public void setGame(String game) {
		this.game = game;
	}

	public void setPutOut(String putOut) {
		this.putOut = putOut;
	}

	public void setKilling(String killing) {
		this.killing = killing;
	}

	public void setError(String error) {
		this.error = error;
	}

	public void setDoublePlay(String doublePlay) {
		this.doublePlay = doublePlay;
	}

	public void setPassedBall(String passedBall) {
		this.passedBall = passedBall;
	}

	public void setFieldingPercentage(String fieldingPercentage) {
		this.fieldingPercentage = fieldingPercentage;
	}
}
