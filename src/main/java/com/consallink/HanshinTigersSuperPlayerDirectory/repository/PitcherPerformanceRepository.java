package com.consallink.HanshinTigersSuperPlayerDirectory.repository;

import org.springframework.data.repository.CrudRepository;

import com.consallink.HanshinTigersSuperPlayerDirectory.model.PitcherPerformance;

public interface PitcherPerformanceRepository extends CrudRepository<PitcherPerformance, Integer> {

	PitcherPerformance findByPlayerId(int playerId);
}
