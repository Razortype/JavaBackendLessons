package com.razortype.GameStoreSystem.api.api.controller;

import com.razortype.GameStoreSystem.business.abstracts.GameOwnershipService;
import com.razortype.GameStoreSystem.core.result.DataResult;
import com.razortype.GameStoreSystem.entities.concretes.GameOwnership;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController @RequestMapping("api/game-ownership")
public class GameOwnershipController {

    private final GameOwnershipService gameOwnershipService;

    @GetMapping("/all")
    public DataResult<List<GameOwnership>> getAll() {
        return this.gameOwnershipService.getAll();
    }

}
