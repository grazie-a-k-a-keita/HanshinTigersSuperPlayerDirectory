package com.consallink.HanshinTigersSuperPlayerDirectory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.consallink.HanshinTigersSuperPlayerDirectory.model.Player;
import com.consallink.HanshinTigersSuperPlayerDirectory.service.PlayerService;

@RestController
public class PlayerController {
	@Autowired
	PlayerService playerService;

	@GetMapping("/player")
	public Player player(@RequestParam(value = "number", defaultValue = "0") String number) {
		return playerService.getPlayer(number);
	}

	@GetMapping("/id")
	public Player playerToId(@RequestParam(value = "id", defaultValue = "0") int id) {
		return playerService.getPlayerToId(id);
	}

	@GetMapping("/reference")
	public List<Player> listComments() {
		return playerService.findAllPlayerData();
	}
}
