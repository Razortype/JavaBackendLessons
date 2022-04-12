package com.company.dataAccess.concretes;

import com.company.dataAccess.abstracts.FoodOrderDao;
import com.company.entities.concretes.Food;

import java.util.ArrayList;

public class PostgreFoodOrder implements FoodOrderDao {

    @Override
    public ArrayList<Food> getAll() {
        return null;
    }

    @Override
    public void add(Food food) {

    }

    @Override
    public void delete(Food food) {

    }

    @Override
    public Food get(int id) {
        return null;
    }
}
