package com.razortype.GameStoreSystem.api.api.controller;

import com.razortype.GameStoreSystem.business.abstracts.GameService;
import com.razortype.GameStoreSystem.core.result.DataResult;
import com.razortype.GameStoreSystem.core.result.ErrorResult;
import com.razortype.GameStoreSystem.core.result.Result;
import com.razortype.GameStoreSystem.entities.concretes.Game;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController @RequestMapping("api/game")
public class GameController {

    private final GameService gameService;

    @GetMapping("/all")
    public ResponseEntity<Result> getAll() {
        DataResult<List<Game>> games =  this.gameService.getAll();
        if (games.isSuccess())
            return new ResponseEntity<>(games, HttpStatus.OK);
        return new ResponseEntity<>(new ErrorResult(games.getMessage()), HttpStatus.BAD_REQUEST);
    }

    @GetMapping("/loadNewData")
    public ResponseEntity<Result> loadGames(@RequestParam int start, @RequestParam int range) {
        DataResult<List<Game>> loadGames = this.gameService.loadGames(start, range);
        if (loadGames.isSuccess())
            return new ResponseEntity<>(loadGames, HttpStatus.OK);
        return new ResponseEntity<>(new ErrorResult(loadGames.getMessage()), HttpStatus.BAD_REQUEST);
    }

}
