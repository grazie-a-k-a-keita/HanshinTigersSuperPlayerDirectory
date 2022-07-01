package com.consallink.HanshinTigersSuperPlayerDirectory.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.consallink.HanshinTigersSuperPlayerDirectory.model.DefensivePerformance;

public interface DefensivePerformanceRepository extends CrudRepository<DefensivePerformance, Integer> {

	List<DefensivePerformance> findByPlayerId(int playerId);
}
