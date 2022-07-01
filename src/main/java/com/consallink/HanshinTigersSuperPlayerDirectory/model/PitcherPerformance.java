package com.consallink.HanshinTigersSuperPlayerDirectory.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pitcher_performance")
public class PitcherPerformance {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private int playerId;
	private String pitched;
	private String win;
	private String lose;
	private String save;
	private String hold;
	private String holdPoint;
	private String completeGame;
	private String shutout;
	private String noFourBalls;
	private String winRate;
	private String batter;
	private String inningsPitched;
	private String hitting;
	private String homeRun;
	private String walk;
	private String intentionalWalk;
	private String hit_by_a_pitch;
	private String strikeOut;
	private String wildPitch;
	private String balk;
	private String conceded;
	private String earnedRun;
	private String earnedRunAverage;

	protected PitcherPerformance() {
	}

	public int getId() {
		return id;
	}

	public int getPlayerId() {
		return playerId;
	}

	public String getPitched() {
		return pitched;
	}

	public String getWin() {
		return win;
	}

	public String getLose() {
		return lose;
	}

	public String getSave() {
		return save;
	}

	public String getHold() {
		return hold;
	}

	public String getHoldPoint() {
		return holdPoint;
	}

	public String getCompleteGame() {
		return completeGame;
	}

	public String getShutout() {
		return shutout;
	}

	public String getNoFourBalls() {
		return noFourBalls;
	}

	public String getWinRate() {
		return winRate;
	}

	public String getBatter() {
		return batter;
	}

	public String getInningsPitched() {
		return inningsPitched;
	}

	public String getHitting() {
		return hitting;
	}

	public String getHomeRun() {
		return homeRun;
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

	public String getWildPitch() {
		return wildPitch;
	}

	public String getBalk() {
		return balk;
	}

	public String getConceded() {
		return conceded;
	}

	public String getEarnedRun() {
		return earnedRun;
	}

	public String getEarnedRunAverage() {
		return earnedRunAverage;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public void setPitched(String pitched) {
		this.pitched = pitched;
	}

	public void setWin(String win) {
		this.win = win;
	}

	public void setLose(String lose) {
		this.lose = lose;
	}

	public void setSave(String save) {
		this.save = save;
	}

	public void setHold(String hold) {
		this.hold = hold;
	}

	public void setHoldPoint(String holdPoint) {
		this.holdPoint = holdPoint;
	}

	public void setCompleteGame(String completeGame) {
		this.completeGame = completeGame;
	}

	public void setShutout(String shutout) {
		this.shutout = shutout;
	}

	public void setNoFourBalls(String noFourBalls) {
		this.noFourBalls = noFourBalls;
	}

	public void setWinRate(String winRate) {
		this.winRate = winRate;
	}

	public void setBatter(String batter) {
		this.batter = batter;
	}

	public void setInningsPitched(String inningsPitched) {
		this.inningsPitched = inningsPitched;
	}

	public void setHitting(String hitting) {
		this.hitting = hitting;
	}

	public void setHomeRun(String homeRun) {
		this.homeRun = homeRun;
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

	public void setWildPitch(String wildPitch) {
		this.wildPitch = wildPitch;
	}

	public void setBalk(String balk) {
		this.balk = balk;
	}

	public void setConceded(String conceded) {
		this.conceded = conceded;
	}

	public void setEarnedRun(String earnedRun) {
		this.earnedRun = earnedRun;
	}

	public void setEarnedRunAverage(String earnedRunAverage) {
		this.earnedRunAverage = earnedRunAverage;
	}
}
