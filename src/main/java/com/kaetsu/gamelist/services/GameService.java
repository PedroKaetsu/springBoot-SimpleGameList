package com.kaetsu.gamelist.services;

import java.util.List;

import com.kaetsu.gamelist.dto.GameDTO;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.kaetsu.gamelist.entities.Game;
import com.kaetsu.gamelist.dto.GameMinDTO;
import com.kaetsu.gamelist.repositories.GameRepository;
import org.springframework.transaction.annotation.Transactional;

@Service
public class GameService {
    
    @Autowired
    private GameRepository gameRepository;

    // This annotation makes the method be executed in a transactional context, respecting the ACID rules
    // ACID - Atomic, Consistent, Isolated, Durable
    // readOnly indicates that the method only reads data from the database, so it can be optimized
    @Transactional(readOnly = true)
    public GameDTO findById(Long id) {
        // TODO: Handle the case when the game is not found
        Game result = gameRepository.findById(id).get();
        return new GameDTO(result);
    }

    @Transactional(readOnly = true)
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