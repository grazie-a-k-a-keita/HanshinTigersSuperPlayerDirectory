package com.consallink.HanshinTigersSuperPlayerDirectory.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.consallink.HanshinTigersSuperPlayerDirectory.model.PlayerComment;

public interface PlayerCommentRepository extends CrudRepository<PlayerComment, Integer> {

	List<PlayerComment> findByPlayerId(int playerId);

	List<PlayerComment> findAllByOrderById();

	@Modifying
	@Query("update PlayerComment pc set pc.context = :context, pc.myContext = :myContext where pc.id = :id")
	int updateComment(@Param("id") int id, @Param("context") String context, @Param("myContext") String myContext);
}
