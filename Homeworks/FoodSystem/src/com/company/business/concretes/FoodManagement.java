package com.company.business.concretes;

import com.company.business.abstracts.FoodService;
import com.company.entities.concretes.Food;

import java.util.HashMap;


public class FoodManagement implements FoodService {

    HashMap<Integer, Food> foodOrderList = new HashMap<>();

    @Override
    public void addFood(int userId, Food food) {
        foodOrderList.put(userId, food);
    }

    @Override
    public void removeFood(int userId) {
        foodOrderList.remove(userId);
    }
}
