package com.dougblizz.library.games.controllers;

import com.dougblizz.library.games.database.entities.Games;
import com.dougblizz.library.games.services.GamesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/games")
public class GamesController {

    @Autowired
    @Qualifier("gamesService")
    private GamesService gamesService;

    @GetMapping
    public List<Games> gamesList() {
        return gamesService.listAllGames();
    }
}
