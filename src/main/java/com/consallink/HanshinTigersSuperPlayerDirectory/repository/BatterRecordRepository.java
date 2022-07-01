package com.consallink.HanshinTigersSuperPlayerDirectory.repository;

import org.springframework.data.repository.CrudRepository;

import com.consallink.HanshinTigersSuperPlayerDirectory.model.BatterRecord;

public interface BatterRecordRepository extends CrudRepository<BatterRecord, Integer> {

	BatterRecord findByPlayerId(int playerId);
}
