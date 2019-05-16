package com.dougblizz.library.games.services;

import com.dougblizz.library.games.database.entities.Games;
import com.dougblizz.library.games.database.repositories.GamesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("gamesService")
public class GamesServiceImpl implements GamesService {

    @Autowired
    @Qualifier("gamesRepository")
    private GamesRepository gamesRepository;

    @Override
    public List<Games> listAllGames() {
        return gamesRepository.findAll();
    }
}
