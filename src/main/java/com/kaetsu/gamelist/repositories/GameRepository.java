package com.kaetsu.gamelist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kaetsu.gamelist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}