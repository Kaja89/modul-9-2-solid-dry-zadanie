package com.kodilla.modul92zadanie.good.patterns.challenges;

public class ProductOrderService {
    private InformationService informationService;
    private SaleService saleService;

    public ProductOrderService(InformationService informationService, SaleService saleService) {
        this.informationService = informationService;
        this.saleService = saleService;
    }

    public SaleDto process(final User user, final Product product, int amount) {
        boolean isSold = saleService.sell(product, user, amount);
        if (isSold) {
            informationService.sendMessage(user);
            return new SaleDto(product, true);
        } else
            return new SaleDto(product, false);
    }
}
