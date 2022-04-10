package com.dev.designPatterns.order;

import java.math.BigDecimal;

public class GenerateOrder {

    private String client;
    private BigDecimal budgetValue;
    private int ItemsQuantity;

    public GenerateOrder(String client, BigDecimal budgetValue, int itemsQuantity) {
        this.client = client;
        this.budgetValue = budgetValue;
        ItemsQuantity = itemsQuantity;
    }

    public String getClient() {
        return client;
    }

    public BigDecimal getBudgetValue() {
        return budgetValue;
    }

    public int getItemsQuantity() {
        return ItemsQuantity;
    }
}
