package com.dougblizz.library.games.services;

import com.dougblizz.library.games.database.entities.Games;

import java.util.List;

public interface GamesService {
    public abstract List<Games> listAllGames();
}
