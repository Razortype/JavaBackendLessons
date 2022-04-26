package com.razortype.GameStoreSystem.business.abstracts;

import com.razortype.GameStoreSystem.entities.concretes.Game;

import java.util.List;

public interface GameService {

    List<Game> getAll();

}
