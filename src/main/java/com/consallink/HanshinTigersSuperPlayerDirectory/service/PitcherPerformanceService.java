package com.consallink.HanshinTigersSuperPlayerDirectory.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.consallink.HanshinTigersSuperPlayerDirectory.model.PitcherPerformance;
import com.consallink.HanshinTigersSuperPlayerDirectory.repository.PitcherPerformanceRepository;

@Service
@Transactional
public class PitcherPerformanceService {

	@Autowired
	PitcherPerformanceRepository pitcherPerformanceRepository;

	/**
	 * 選手の投手成績を取得する
	 * 
	 * @param playerId 選手ID
	 * @return
	 */
	public PitcherPerformance getPitcherPerformance(int playerId) {
		PitcherPerformance pitcherPerformance = pitcherPerformanceRepository.findByPlayerId(playerId);
		return pitcherPerformance;
	}
}
