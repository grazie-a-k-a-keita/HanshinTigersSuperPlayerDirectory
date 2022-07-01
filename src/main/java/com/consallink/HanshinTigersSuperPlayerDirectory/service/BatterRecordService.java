package com.consallink.HanshinTigersSuperPlayerDirectory.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.consallink.HanshinTigersSuperPlayerDirectory.model.BatterRecord;
import com.consallink.HanshinTigersSuperPlayerDirectory.repository.BatterRecordRepository;

@Service
@Transactional
public class BatterRecordService {

	@Autowired
	BatterRecordRepository batterRecordRepository;

	/**
	 * 選手の打撃成績を取得する
	 * 
	 * @param playerId 選手ID
	 * @return
	 */
	public BatterRecord getBatterRecord(int playerId) {
		BatterRecord batterRecord = batterRecordRepository.findByPlayerId(playerId);
		return batterRecord;
	}
}
