package com.razortype.GameStoreSystem.dataAccess.abstracts;

import com.razortype.GameStoreSystem.entities.concretes.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameDao extends JpaRepository<Game, Integer> {
}
