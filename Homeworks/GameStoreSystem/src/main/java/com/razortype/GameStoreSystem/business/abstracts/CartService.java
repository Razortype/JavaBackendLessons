package com.razortype.GameStoreSystem.business.abstracts;

import com.razortype.GameStoreSystem.entities.concretes.Game;

import java.util.List;

public interface CartService {

    void addToCart(Game game);
    void removeFromCart(Game game);
    List<Game> showCartList();
    boolean buyAllGames();

}
