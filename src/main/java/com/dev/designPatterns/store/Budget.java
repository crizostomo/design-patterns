package com.dev.designPatterns.store;

import com.dev.designPatterns.status.BudgetStatus;
import com.dev.designPatterns.status.InAnalysis;

import java.math.BigDecimal;

public class Budget {

    private BigDecimal value;
    private int itemsQuantity;
    private BudgetStatus status;

    public Budget(BigDecimal value, int itemsQuantity) {
        this.value = value;
        this.itemsQuantity = itemsQuantity;
        this.status = new InAnalysis();
    }

    public void applyExtraDiscount(){
        BigDecimal extraDiscountValue = this.status.calculateValueExtraDiscount(this);
        this.value = this.value.subtract(extraDiscountValue);
    }

    public void approve(){
        this.status.approve(this);
    }

    public void deny(){
        this.status.deny(this);
    }

    public void finish(){
        this.status.finish(this);
    }

    public BigDecimal getValue() {
        return value;
    }

    public int getItemsQuantity() {
        return itemsQuantity;
    }

    public BudgetStatus getStatus() {
        return status;
    }

    public void setStatus(BudgetStatus status) {
        this.status = status;
    }
}
