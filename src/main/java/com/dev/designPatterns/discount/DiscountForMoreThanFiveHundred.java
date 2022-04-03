package com.dev.designPatterns.discount;

import com.dev.designPatterns.store.Budget;

import java.math.BigDecimal;

public class DiscountForMoreThanFiveHundred extends Discount {

    public DiscountForMoreThanFiveHundred(Discount next) {
        super(next);
    }

    public BigDecimal doCalculation(Budget budget){
        return budget.getValue().multiply(new BigDecimal("0.05"));
    }

    @Override
    public boolean shouldApply(Budget budget) {
        return budget.getValue().compareTo(new BigDecimal("500")) > 0;
    }
}
