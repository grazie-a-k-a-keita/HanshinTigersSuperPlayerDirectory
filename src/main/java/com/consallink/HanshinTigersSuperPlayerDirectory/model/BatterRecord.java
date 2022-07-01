package com.consallink.HanshinTigersSuperPlayerDirectory.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "batter_record")
public class BatterRecord {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private int playerId;
	private String game;
	private String bat;
	private String atBat;
	private String score;
	private String hitting;
	private String twoBaseHit;
	private String threeBaseHit;
	private String homeRun;
	private String baseHit;
	private String runBattedIn;
	private String stolenBase;
	private String caughtStealing;
	private String sacrificeBunt;
	private String sacrificeFly;
	private String walk;
	private String intentionalWalk;
	private String hit_by_a_pitch;
	private String strikeOut;
	private String doublePlay;
	private String battingAverage;
	private String sluggingPercentage;
	private String onBasePercentage;

	protected BatterRecord() {
	}

	public int getId() {
		return id;
	}

	public int getPlayerId() {
		return playerId;
	}

	public String getGame() {
		return game;
	}

	public String getBat() {
		return bat;
	}

	public String getAtBat() {
		return atBat;
	}

	public String getScore() {
		return score;
	}

	public String getHitting() {
		return hitting;
	}

	public String getTwoBaseHit() {
		return twoBaseHit;
	}

	public String getThreeBaseHit() {
		return threeBaseHit;
	}

	public String getHomeRun() {
		return homeRun;
	}

	public String getBaseHit() {
		return baseHit;
	}

	public String getRunBattedIn() {
		return runBattedIn;
	}

	public String getStolenBase() {
		return stolenBase;
	}

	public String getCaughtStealing() {
		return caughtStealing;
	}

	public String getSacrificeBunt() {
		return sacrificeBunt;
	}

	public String getSacrificeFly() {
		return sacrificeFly;
	}

	public String getWalk() {
		return walk;
	}

	public String getIntentionalWalk() {
		return intentionalWalk;
	}

	public String getHit_by_a_pitch() {
		return hit_by_a_pitch;
	}

	public String getStrikeOut() {
		return strikeOut;
	}

	public String getDoublePlay() {
		return doublePlay;
	}

	public String getBattingAverage() {
		return battingAverage;
	}

	public String getSluggingPercentage() {
		return sluggingPercentage;
	}

	public String getOnBasePercentage() {
		return onBasePercentage;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public void setGame(String game) {
		this.game = game;
	}

	public void setBat(String bat) {
		this.bat = bat;
	}

	public void setAtBat(String atBat) {
		this.atBat = atBat;
	}

	public void setScore(String score) {
		this.score = score;
	}

	public void setHitting(String hitting) {
		this.hitting = hitting;
	}

	public void setTwoBaseHit(String twoBaseHit) {
		this.twoBaseHit = twoBaseHit;
	}

	public void setThreeBaseHit(String threeBaseHit) {
		this.threeBaseHit = threeBaseHit;
	}

	public void setHomeRun(String homeRun) {
		this.homeRun = homeRun;
	}

	public void setBaseHit(String baseHit) {
		this.baseHit = baseHit;
	}

	public void setRunBattedIn(String runBattedIn) {
		this.runBattedIn = runBattedIn;
	}

	public void setStolenBase(String stolenBase) {
		this.stolenBase = stolenBase;
	}

	public void setCaughtStealing(String caughtStealing) {
		this.caughtStealing = caughtStealing;
	}

	public void setSacrificeBunt(String sacrificeBunt) {
		this.sacrificeBunt = sacrificeBunt;
	}

	public void setSacrificeFly(String sacrificeFly) {
		this.sacrificeFly = sacrificeFly;
	}

	public void setWalk(String walk) {
		this.walk = walk;
	}

	public void setIntentionalWalk(String intentionalWalk) {
		this.intentionalWalk = intentionalWalk;
	}

	public void setHit_by_a_pitch(String hit_by_a_pitch) {
		this.hit_by_a_pitch = hit_by_a_pitch;
	}

	public void setStrikeOut(String strikeOut) {
		this.strikeOut = strikeOut;
	}

	public void setDoublePlay(String doublePlay) {
		this.doublePlay = doublePlay;
	}

	public void setBattingAverage(String battingAverage) {
		this.battingAverage = battingAverage;
	}

	public void setSluggingPercentage(String sluggingPercentage) {
		this.sluggingPercentage = sluggingPercentage;
	}

	public void setOnBasePercentage(String onBasePercentage) {
		this.onBasePercentage = onBasePercentage;
	}
}
