package com.streamliners.task3_1.controller;

import com.streamliners.task3_1.model.Product;

public class SpecialProduct extends Product {

    double regularPrice;
    int percentageOff;
    /*static double discountedPrice;*/

    public SpecialProduct(String name, double price) {
        super(name, price);
    }

    public static SpecialProduct applyOffOnProduct(Product product, int percentageOff){
        double discountedPrice = product.price - (product.price*percentageOff)/100;
        SpecialProduct specialProduct = new SpecialProduct(product.name,discountedPrice);
        specialProduct.regularPrice = product.price;
        specialProduct.percentageOff = percentageOff;
        return specialProduct;
    }

    @Override
    public String toString(){
        return String.format("Regular Price : %.2f, Percentage Off : %d", this.regularPrice, this.percentageOff);
    }
}
