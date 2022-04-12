package com.company.entities.concretes;

import com.company.entities.abstracts.FoodEntity;

import java.util.ArrayList;
import java.util.Collections;

public class Food implements FoodEntity {

    private int foodId;
    private String name;
    private double price;
    private ArrayList<String> defaultAttributes;
    private double discountPerItem;

    ArrayList<String> itemContainer = new ArrayList<>();

    public Food (int foodId, String name, double price, ArrayList<String> defaultAttributes, double discountPerItem) {
        this.foodId = foodId;
        this.name = name;
        this.price = price;
        this.defaultAttributes = defaultAttributes;
        this.itemContainer = (ArrayList<String>)defaultAttributes.clone();
        this.discountPerItem = discountPerItem;
    }

    public int getFoodId() {
        return foodId;
    }

    public void setFoodId(int foodId) {
        this.foodId = foodId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public ArrayList<String> getDefaultAttributes() {
        return defaultAttributes;
    }

    public void setDefaultAttributes(ArrayList<String> defaultAttributes) {
        this.defaultAttributes = defaultAttributes;
    }

    public double getDiscountPerItem() {
        return discountPerItem;
    }

    public void setDiscountPerItem(double discountPerItem) {
        this.discountPerItem = discountPerItem;
    }

    public ArrayList<String> getItemContainer() {
        return itemContainer;
    }

    public void setItemContainer(ArrayList<String> itemContainer) {
        this.itemContainer = itemContainer;
    }

    @Override
    public double getFinalCost() {

        int itemCounter = 0;
        for (String item : this.itemContainer) {
            if (this.defaultAttributes.contains(item)) {
                itemCounter++;
            }
        }

        return this.price - this.discountPerItem * itemCounter;
    }

    @Override
    public void removeItemFromFood(String item) {
        if (this.defaultAttributes.contains(item) && this.itemContainer.contains(item)) {
            this.itemContainer.remove(item);
        }
    }

    @Override
    public void addItemToFood(String item) {
        if (this.defaultAttributes.contains(item) && !this.itemContainer.contains(item)) {
            this.itemContainer.add(item);
        }
    }
}
