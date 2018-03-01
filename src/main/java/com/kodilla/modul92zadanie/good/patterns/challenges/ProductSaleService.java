package com.kodilla.modul92zadanie.good.patterns.challenges;

public class ProductSaleService implements SaleService {
    public boolean sell(Product product, User user, int amount) {
        if (product == null) {
            System.out.println("Product is unavailable");
            return false;
        } else {
            System.out.println("Product: " + product.getName() + " has been bought by: " + user + ", amount: " + amount + ". Total cost: " + product.getPrice() * amount);
            return true;
        }
    }
}
