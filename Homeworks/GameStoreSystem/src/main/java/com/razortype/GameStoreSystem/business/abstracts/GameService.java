package com.razortype.GameStoreSystem.business.abstracts;

import com.razortype.GameStoreSystem.core.result.DataResult;
import com.razortype.GameStoreSystem.entities.concretes.Game;

import java.util.List;

public interface GameService {

    DataResult<List<Game>> getAll();
    DataResult<List<Game>> loadGames(int start, int range);
    


}
