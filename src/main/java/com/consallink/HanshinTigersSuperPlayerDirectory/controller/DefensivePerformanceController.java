package com.consallink.HanshinTigersSuperPlayerDirectory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.consallink.HanshinTigersSuperPlayerDirectory.model.DefensivePerformance;
import com.consallink.HanshinTigersSuperPlayerDirectory.service.DefensivePerformanceService;

@RestController
public class DefensivePerformanceController {
	@Autowired
	DefensivePerformanceService defensivePerformanceService;

	@GetMapping("/defensivePerformance")
	public List<DefensivePerformance> player(@RequestParam(value = "playerId", defaultValue = "0") Integer playerId) {
		return defensivePerformanceService.getDefensivePerformance(playerId);
	}
}
