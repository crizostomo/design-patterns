package com.dev.designPatterns.discount;

import com.dev.designPatterns.store.Budget;

import java.math.BigDecimal;

public class DiscountForMoreThanFiveHundred extends Discount {

    public DiscountForMoreThanFiveHundred(Discount next) {
        super(next);
    }

    public BigDecimal calculate(Budget budget){
        if (budget.getValue().compareTo(new BigDecimal("500")) > 0){
            return budget.getValue().multiply(new BigDecimal("0.05"));
        }
        return next.calculate(budget);
    }
}
