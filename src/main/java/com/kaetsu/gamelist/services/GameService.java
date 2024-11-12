package com.kaetsu.gamelist.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.kaetsu.gamelist.entities.Game;
import com.kaetsu.gamelist.dto.GameMinDTO;
import com.kaetsu.gamelist.repositories.GameRepository;

@Service
public class GameService {
    
    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        // Stream method allows to do operations on a collection of objects
        return result.stream()
                // Map method allows to transform each object in the collection to another type, you can use lambda expression as well -> .map(x -> new GameMinDTO(x))
                .map(GameMinDTO::new)
                // toList method allows to collect the transformed objects into a new list
                .toList();
    }
}