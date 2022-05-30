package com.razortype.GameStoreSystem.business.concretes;

import com.razortype.GameStoreSystem.business.abstracts.CartService;
import com.razortype.GameStoreSystem.entities.concretes.Game;
import com.razortype.GameStoreSystem.entities.concretes.User;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class CartManager implements CartService {

    User user;
    List<Game> listOfGames = new ArrayList<>();


    @Override
    public void addToCart(Game game) {
        this.listOfGames.add(game);
    }

    @Override
    public void removeFromCart(Game game) {
        this.listOfGames.remove(game);
    }

    @Override
    public List<Game> showCartList() {
        return this.listOfGames;
    }

    @Override
    public boolean buyAllGames() {
        return false;
    }

}
