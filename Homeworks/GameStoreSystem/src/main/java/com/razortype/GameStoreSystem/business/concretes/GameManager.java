package com.razortype.GameStoreSystem.business.concretes;

import com.razortype.GameStoreSystem.business.abstracts.GameService;
import com.razortype.GameStoreSystem.core.result.DataResult;
import com.razortype.GameStoreSystem.core.result.SuccessDataResult;
import com.razortype.GameStoreSystem.dataAccess.abstracts.GameDao;
import com.razortype.GameStoreSystem.entities.concretes.Game;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@RequiredArgsConstructor
@Service
public class GameManager implements GameService {

    private final GameDao gameDao;

    @Override
    public DataResult<List<Game>> getAll() {
        List<Game> games = this.gameDao.findAll();
        return new SuccessDataResult<>(games, "All games executed!");
    }

    @Override
    public DataResult<List<Game>> loadGames(int start, int range) {
        IntStream intStream = IntStream.range(start, start+range);
        List<Game> loadGames = this.gameDao.findAllById(intStream.boxed().collect(Collectors.toList()));
        return new SuccessDataResult<>(loadGames, loadGames.size() + " games executed!");
    }
}
