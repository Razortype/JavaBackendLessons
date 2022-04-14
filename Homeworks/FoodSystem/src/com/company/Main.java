package com.company;

import com.company.business.concretes.EmployeeManagement;
import com.company.business.concretes.FoodManagement;
import com.company.business.concretes.UserManagement;
import com.company.dataAccess.concretes.PostgreEmployeesData;
import com.company.dataAccess.concretes.PostgreFoodOrder;
import com.company.dataAccess.concretes.PostgreUsersData;
import com.company.entities.concretes.Food;
import com.company.entities.concretes.User;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Managers
        UserManagement userManagement = new UserManagement(new PostgreUsersData());
        EmployeeManagement employeeManagement = new EmployeeManagement(new PostgreEmployeesData());
        FoodManagement foodManagement = new FoodManagement(new PostgreFoodOrder());


        User user1 = new User(
                1,
                "Orkun",
                "Kurul",
                "Example.159@outlook.com",
                "123456aa",
                44.15,
                "Table street Wallhall 9th side.",
                "1111222233334444",
                "1231234556"
        );

        ArrayList<String> toppings = new ArrayList<>();
        toppings.add("olive");
        toppings.add("pepperoni");
        toppings.add("salami");
        toppings.add("cheese");

        Food pizza = new Food(
                1,
                "pizza",
                23.15,
                toppings,
                1.2
        );

        userManagement.addUser(user1);

        pizza.removeItemFromFood("salami");

        foodManagement.addFood(user1.getId(), pizza);

        System.out.println((foodManagement.getFoodOrderList().get(user1.getId()).getFinalCost()));


    }
}
