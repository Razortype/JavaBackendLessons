package com.company.business.concretes;

import com.company.business.abstracts.FoodService;
import com.company.dataAccess.concretes.PostgreFoodOrder;
import com.company.entities.concretes.Food;

import java.util.HashMap;


public class FoodManagement implements FoodService {

    HashMap<Integer, Food> foodOrderList = new HashMap<>();

    final private PostgreFoodOrder postgreFoodOrder;

    public FoodManagement(PostgreFoodOrder postgreFoodOrder) {
        this.postgreFoodOrder = postgreFoodOrder;
    }

    @Override
    public void addFood(int userId, Food food) {
        foodOrderList.put(userId, food);
    }

    @Override
    public void removeFood(int userId) {
        foodOrderList.remove(userId);
    }

    public HashMap<Integer, Food> getFoodOrderList() {
        return foodOrderList;
    }
}
