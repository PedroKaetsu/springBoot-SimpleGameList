package com.kaetsu.gamelist.controllers;

import com.kaetsu.gamelist.dto.GameDTO;
import com.kaetsu.gamelist.dto.GameMinDTO;
import com.kaetsu.gamelist.services.GameService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameMinDTO> findAll() {
        return gameService.findAll();
    }

    @GetMapping(value = "/{id}")
    // @PathVariable annotation express to Spring that the value of the id parameter is in the URL
    public GameDTO findById(@PathVariable Long id) {
        return gameService.findById(id);
    }

}