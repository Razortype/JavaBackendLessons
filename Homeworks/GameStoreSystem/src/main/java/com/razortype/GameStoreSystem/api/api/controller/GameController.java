package com.razortype.GameStoreSystem.api.api.controller;

import com.razortype.GameStoreSystem.business.abstracts.GameService;
import com.razortype.GameStoreSystem.dataAccess.abstracts.GameDao;
import com.razortype.GameStoreSystem.entities.concretes.Game;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController @RequestMapping("api/game")
public class GameController {

    private final GameService gameService;

    @GetMapping("/all")
    public List<Game> getAll() {
        return this.gameService.getAll();
    }

}
