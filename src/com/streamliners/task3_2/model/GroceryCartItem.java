package com.streamliners.task3_2.model;

public class GroceryCartItem extends GroceryItem{

    float price;
    float quantity;

    public GroceryCartItem(String name, int pricePerKg) {
        super(name, pricePerKg);
    }

    public static float extractQuantity(String quantityStr){
        String [] newString = quantityStr.split(" ");
        newString[0] = newString[0].replace("Kg","");
        newString[1] = newString[1].replace("g","");

        float totalPrice;
        float temp1 = Float.parseFloat(newString[0]);
        float temp2 = Float.parseFloat(newString[1])/1000;

        totalPrice = temp1+temp2;
        return totalPrice;
    }

    public static GroceryCartItem createNew(GroceryItem item, String quantityStr){
        GroceryCartItem cartItem = new GroceryCartItem(item.name,item.pricePerKg);
        cartItem.quantity = extractQuantity(quantityStr);
        cartItem.price = cartItem.pricePerKg * cartItem.quantity;
        return cartItem;
    }

    @Override
    public String toString(){
        return String.format("%s (Rs. %d X %f) = ",this.name,this.pricePerKg,this.quantity);
    }
}
