package com.streamliners.task3_1.model;

public class Product {

    public String name;
    public double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Product() {
    }

    @Override
    public String toString(){
        return String.format("Name : %s @ Rs. %.2f",this.name,this.price);
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;

        Product product = (Product)o;
        return product.name == name && product.price == price;
    }
}
