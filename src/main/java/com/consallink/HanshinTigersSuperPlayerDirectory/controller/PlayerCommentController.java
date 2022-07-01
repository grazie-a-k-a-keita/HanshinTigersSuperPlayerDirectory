package com.consallink.HanshinTigersSuperPlayerDirectory.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.consallink.HanshinTigersSuperPlayerDirectory.model.PlayerComment;
import com.consallink.HanshinTigersSuperPlayerDirectory.service.PlayerCommentService;

@RestController
public class PlayerCommentController {
	@Autowired
	PlayerCommentService playerCommentService;

	@GetMapping("/comments")
	public List<PlayerComment> listComments() {
		return playerCommentService.listComments();
	}

	@GetMapping(path = "fetchComment", params = "id")
	PlayerComment edit(@RequestParam Integer id) {
		Optional<PlayerComment> playerCommentOpt = playerCommentService.selectById(id);
		PlayerComment playerComment = playerCommentOpt.get();
		return playerComment;
	}

	@PostMapping(path = "edit")
	PlayerComment regist(@RequestBody() PlayerComment playerComment) {
		playerCommentService.update(playerComment);
		return playerComment;
	}
}
