package com.razortype.GameStoreSystem.business.concretes;

import com.razortype.GameStoreSystem.business.abstracts.GameService;
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
    public List<Game> getAll() {
        return this.gameDao.findAll();
    }
}
