package com.kodilla.modul92zadanie.good.patterns.challenges;

public class SaleDto {
    public Product product;
    public boolean isAvailable;

    public SaleDto(Product product, boolean isAvailable) {
        this.product = product;
        this.isAvailable = isAvailable;
    }

    public Product getProduct() {
        return product;
    }

    public boolean getIsAvailable() {
        return isAvailable;
    }

}
