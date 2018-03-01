package com.kodilla.modul92zadanie.good.patterns.challenges;

public class MainApp {
    public static void main(String[] args) {

        User user = new User("Edward", "Kowalski");
        Product toothBrush = new ToothBrush("Szczoteczka", 7.50);
        ProductOrderService saleProcessor = new ProductOrderService(new MailService(), new ProductSaleService());
        saleProcessor.process(user, toothBrush, 3);

        Product toothPaste = null;
        saleProcessor.process(user, toothPaste, 2);
    }
}
