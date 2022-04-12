package com.company.dataAccess.abstracts;

import com.company.entities.concretes.Food;

import java.util.ArrayList;

public interface FoodOrderDao {

    ArrayList<Food> getAll();
    void add(Food food);
    void delete(Food food);
    Food get(int id);

}
