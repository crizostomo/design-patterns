package com.dev.designPatterns.budget;

import com.dev.designPatterns.status.BudgetStatus;
import com.dev.designPatterns.status.Finished;
import com.dev.designPatterns.status.InAnalysis;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Budget implements Budgetable {

    private BigDecimal value;
    private BudgetStatus status;
    private List<Budgetable> items;

    public Budget() {
        this.value = BigDecimal.ZERO;
        this.items = new ArrayList<>();
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
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return value;
    }

    public int getItemsQuantity() {
        return items.size();
    }

    public BudgetStatus getStatus() {
        return status;
    }

    public void setStatus(BudgetStatus status) {
        this.status = status;
    }

    public boolean isFinished() {
        return status instanceof Finished;
    }

    public void addItem(Budgetable item) {
        this.value = value.add(item.getValue());
        this.items.add(item);
    }
}
