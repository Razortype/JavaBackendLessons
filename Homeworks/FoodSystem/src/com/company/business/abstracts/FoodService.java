package com.company.business.abstracts;

import com.company.entities.concretes.Food;

public interface FoodService {

    void addFood(int id, Food food);
    void removeFood(int id);

}
