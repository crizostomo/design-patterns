package com.dev.designPatterns.discount;

import com.dev.designPatterns.budget.Budget;

import java.math.BigDecimal;

public class DiscountForMoreThanFiveItems extends Discount {

    public DiscountForMoreThanFiveItems(Discount next) {
        super(next);
    }

    public BigDecimal doCalculation(Budget budget){
        return budget.getValue().multiply(new BigDecimal("0.1"));
    }

    @Override
    public boolean shouldApply(Budget budget) {
        return budget.getItemsQuantity() > 5;
    }
}
