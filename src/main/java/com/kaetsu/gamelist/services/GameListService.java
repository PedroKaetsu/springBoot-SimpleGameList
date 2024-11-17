package com.kaetsu.gamelist.services;

import com.kaetsu.gamelist.dto.GameListDTO;
import com.kaetsu.gamelist.entities.GameList;
import com.kaetsu.gamelist.repositories.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {
    
    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> result = gameListRepository.findAll();
        // Stream method allows to do operations on a collection of objects
        return result.stream()
                // Map method allows to transform each object in the collection to another type, you can use lambda expression as well -> .map(x -> new GameMinDTO(x))
                .map(GameListDTO::new)
                // toList method allows to collect the transformed objects into a new list
                .toList();
    }
}