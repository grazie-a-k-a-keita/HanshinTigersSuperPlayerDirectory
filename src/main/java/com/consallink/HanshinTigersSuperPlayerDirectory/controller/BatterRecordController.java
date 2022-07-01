package com.consallink.HanshinTigersSuperPlayerDirectory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.consallink.HanshinTigersSuperPlayerDirectory.model.BatterRecord;
import com.consallink.HanshinTigersSuperPlayerDirectory.service.BatterRecordService;

@RestController
public class BatterRecordController {
	@Autowired
	BatterRecordService batterRecordService;

	@GetMapping("/batterRecord")
	public BatterRecord player(@RequestParam(value = "playerId", defaultValue = "0") Integer playerId) {
		return batterRecordService.getBatterRecord(playerId);
	}
}
