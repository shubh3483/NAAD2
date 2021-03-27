package com.streamliners.task3_2.controller;

import com.streamliners.task3_2.model.Cart;
import com.streamliners.task3_2.model.GroceryCartItem;
import com.streamliners.task3_2.model.GroceryItem;

public class Main {

    public static void main(String[] args) {
        GroceryItem groceryItem1 = new GroceryCartItem("Rice",80);
        GroceryItem groceryItem2 = new GroceryCartItem("Wheat",35);
        GroceryItem groceryItem3 = new GroceryCartItem("Face Wash",1000);
        GroceryItem groceryItem4 = new GroceryCartItem("Maggi",200);

        Cart cart = new Cart();

        GroceryCartItem groceryCartItem1 = GroceryCartItem.createNew(groceryItem1,"2Kg 350g");
        GroceryCartItem groceryCartItem2 = GroceryCartItem.createNew(groceryItem4,"0Kg 500g");

        cart.add(groceryCartItem1);
        cart.add(groceryCartItem2);

        System.out.println(cart);
    }
}
