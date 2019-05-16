package com.dougblizz.library.games.database.repositories;

import com.dougblizz.library.games.database.entities.Games;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository("gamesRepository")
public interface GamesRepository extends JpaRepository <Games, Serializable> {
}
