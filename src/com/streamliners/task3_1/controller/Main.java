package com.streamliners.task3_1.controller;

import com.streamliners.task3_1.model.Product;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Nike shoes",15000);
        Product product2 = new Product("Nike shoes",15000);
        Product product3 = new Product("T-Shirt",890);

        System.out.println(product1);
        System.out.println(product2);
        System.out.println(product3);

        System.out.println(product1.equals(product2));
        System.out.println(product1.equals(product3));

        SpecialProduct specialProduct = SpecialProduct.applyOffOnProduct(product1,20);

        System.out.println(specialProduct);
    }
}
