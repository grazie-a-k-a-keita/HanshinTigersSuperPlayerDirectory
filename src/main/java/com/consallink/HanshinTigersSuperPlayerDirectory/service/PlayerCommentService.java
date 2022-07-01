package com.consallink.HanshinTigersSuperPlayerDirectory.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.consallink.HanshinTigersSuperPlayerDirectory.model.PlayerComment;
import com.consallink.HanshinTigersSuperPlayerDirectory.repository.PlayerCommentRepository;

@Service
@Transactional
public class PlayerCommentService {

	@Autowired
	PlayerCommentRepository playerCommentRepository;

	public List<PlayerComment> listComments() {
		var source = playerCommentRepository.findAllByOrderById();
		List<PlayerComment> comments = new ArrayList<PlayerComment>();
		source.forEach(comments::add);
		return comments;
	}

	public void update(PlayerComment playerComment) {
		playerCommentRepository.updateComment(playerComment.getId(), playerComment.getContext(),
				playerComment.getMyContext());
	}

	public Optional<PlayerComment> selectById(Integer id) {
		return playerCommentRepository.findById(id);
	}
}
