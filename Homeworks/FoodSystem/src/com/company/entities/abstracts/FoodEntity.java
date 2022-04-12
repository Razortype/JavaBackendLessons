package com.company.entities.abstracts;

public interface FoodEntity {

    double getFinalCost();
    void removeItemFromFood(String item);
    void addItemToFood(String item);

}
