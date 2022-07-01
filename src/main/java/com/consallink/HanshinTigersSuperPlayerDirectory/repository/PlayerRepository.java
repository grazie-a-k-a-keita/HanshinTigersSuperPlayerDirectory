package com.consallink.HanshinTigersSuperPlayerDirectory.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.consallink.HanshinTigersSuperPlayerDirectory.model.Player;

public interface PlayerRepository extends CrudRepository<Player, Integer> {

	Player findByBackNumber(String backNumber);

	Player findById(int id);

	List<Player> findAllByOrderById();
}
