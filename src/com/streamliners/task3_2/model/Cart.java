package com.streamliners.task3_2.model;

import java.util.ArrayList;

public class Cart {
    ArrayList<GroceryCartItem> cartItems;
    float totalAmount;

    public Cart() {
        cartItems = new ArrayList<>();
        totalAmount = 0;
    }

    public Cart add (GroceryCartItem item){
        cartItems.add(item);
        totalAmount+= item.price;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Cart{\n \t groceryCartItems = { \n ");
        for (GroceryCartItem groceryCartItem : cartItems) {
            stringBuilder.append("\t\t"+groceryCartItem.name+" (Rs "+groceryCartItem.pricePerKg+" X "+groceryCartItem.quantity+" Kg) = Rs."+groceryCartItem.price+",\n");
        }
        stringBuilder.append("\t\t],\n \t totalAmount = Rs."+totalAmount+"\n}");
        return stringBuilder.toString();
    }
}
