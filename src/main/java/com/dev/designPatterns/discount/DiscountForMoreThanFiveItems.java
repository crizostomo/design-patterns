package com.dev.designPatterns.discount;

import com.dev.designPatterns.store.Budget;

import java.math.BigDecimal;

public class DiscountForMoreThanFiveItems extends Discount {

    public DiscountForMoreThanFiveItems(Discount next) {
        super(next);
    }

    public BigDecimal calculate(Budget budget){
        if (budget.getItemsQuantity() > 5){
            return budget.getValue().multiply(new BigDecimal("0.1"));
        }
        return next.calculate(budget);
    }
}
