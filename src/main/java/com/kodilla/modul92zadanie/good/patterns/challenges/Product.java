package com.kodilla.modul92zadanie.good.patterns.challenges;

public abstract class Product {
    String name;
    double price;

    public Product() {

    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
