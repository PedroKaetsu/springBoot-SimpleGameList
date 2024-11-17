package com.kaetsu.gamelist.repositories;

import com.kaetsu.gamelist.projections.GameMinProjection;
import org.springframework.data.jpa.repository.JpaRepository;

import com.kaetsu.gamelist.entities.Game;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface GameRepository extends JpaRepository<Game, Long> {

    // This annotation is used to define a custom query for the searchByList method
    // It is a native query(nativeQuery = true), meaning it is written in SQL instead of JPQL
    // So, the return variable must be a List of a custom projection interface
    @Query(nativeQuery = true, value = """
		SELECT tb_games.id, tb_games.title, tb_games.game_year AS `year`, tb_games.img_url AS imgUrl, tb_games.short_description AS shortDescription, tb_belonging.position
		FROM tb_games
		INNER JOIN tb_belonging ON tb_games.id = tb_belonging.game_id
		WHERE tb_belonging.list_id = :listId
		ORDER BY tb_belonging.position
			""")
    // This method uses the above @Query annotation and proper query to fetch the required data
    // And will be accessible on controller calling gameRepository.searchByList(listId)
    List<GameMinProjection> searchByList(Long listId);
}