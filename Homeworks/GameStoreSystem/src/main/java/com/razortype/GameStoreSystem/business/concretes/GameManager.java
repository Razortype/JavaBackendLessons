package com.razortype.GameStoreSystem.business.concretes;

import com.razortype.GameStoreSystem.business.abstracts.GameService;
import com.razortype.GameStoreSystem.core.result.DataResult;
import com.razortype.GameStoreSystem.core.result.SuccessDataResult;
import com.razortype.GameStoreSystem.dataAccess.abstracts.GameDao;
import com.razortype.GameStoreSystem.entities.concretes.Game;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class GameManager implements GameService {

    private final GameDao gameDao;

    @Override
    public DataResult<List<Game>> getAll() {
        List<Game> games = this.gameDao.findAll();
        return new SuccessDataResult<>(games, "All games executed!");
    }
}
