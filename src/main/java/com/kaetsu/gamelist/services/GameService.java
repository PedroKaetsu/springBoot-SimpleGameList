package com.kaetsu.gamelist.services;

import java.util.list;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.kaetsu.gamelist.entities.Game;
import com.kaetsu.gamelist.dto.GameMinDTO;
import com.kaetsu.gamelist.repositories.GameRepository;

@Service
public class GameService {
    
    @Autowired
    private GameRepository gameRepository;

    public List<Game> findAll() {
        List<Game> result = gameRepository.findAll()
        return result;
    }
}