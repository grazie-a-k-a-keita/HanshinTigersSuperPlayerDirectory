package com.consallink.HanshinTigersSuperPlayerDirectory.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.consallink.HanshinTigersSuperPlayerDirectory.model.Player;
import com.consallink.HanshinTigersSuperPlayerDirectory.repository.PlayerRepository;

@Service
@Transactional
public class PlayerService {

	@Autowired
	PlayerRepository playerRepository;

	/**
	 * 背番号から選手を一人取得する
	 * 
	 * @param backNumber 検索したい選手の背番号
	 * @return
	 */
	public Player getPlayer(String backNumber) {
		Player player = playerRepository.findByBackNumber(backNumber);
		return player;
	}

	/**
	 * idから選手を一人取得する
	 * 
	 * @param backNumber 検索したい選手のid
	 * @return
	 */
	public Player getPlayerToId(int id) {
		Player player = playerRepository.findById(id);
		return player;
	}

	/**
	 * レコードを全件取得する。
	 * 
	 * @return
	 */
	public List<Player> findAllPlayerData() {

		return playerRepository.findAllByOrderById();
	}
}