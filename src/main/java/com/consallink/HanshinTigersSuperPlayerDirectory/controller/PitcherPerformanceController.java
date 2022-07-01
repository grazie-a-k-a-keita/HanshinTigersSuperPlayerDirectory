package com.consallink.HanshinTigersSuperPlayerDirectory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.consallink.HanshinTigersSuperPlayerDirectory.model.PitcherPerformance;
import com.consallink.HanshinTigersSuperPlayerDirectory.service.PitcherPerformanceService;

@RestController
public class PitcherPerformanceController {
	@Autowired
	PitcherPerformanceService pitcherPerformanceService;

	@GetMapping("/pitcherPerformance")
	public PitcherPerformance player(@RequestParam(value = "playerId", defaultValue = "0") Integer playerId) {
		return pitcherPerformanceService.getPitcherPerformance(playerId);
	}
}
