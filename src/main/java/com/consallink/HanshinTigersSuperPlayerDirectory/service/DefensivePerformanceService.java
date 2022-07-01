package com.consallink.HanshinTigersSuperPlayerDirectory.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.consallink.HanshinTigersSuperPlayerDirectory.model.DefensivePerformance;
import com.consallink.HanshinTigersSuperPlayerDirectory.repository.DefensivePerformanceRepository;

@Service
@Transactional
public class DefensivePerformanceService {

	@Autowired
	DefensivePerformanceRepository defensivePerformanceRepository;

	/**
	 * 選手の守備成績を取得する
	 * 
	 * @param playerId 選手ID
	 * @return
	 */
	public List<DefensivePerformance> getDefensivePerformance(int playerId) {
		List<DefensivePerformance> defensivePerformance = defensivePerformanceRepository.findByPlayerId(playerId);
		return defensivePerformance;
	}
}
