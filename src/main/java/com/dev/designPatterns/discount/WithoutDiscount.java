package com.dev.designPatterns.discount;

import com.dev.designPatterns.store.Budget;

import java.math.BigDecimal;

public class WithoutDiscount extends Discount {

    public WithoutDiscount() {
        super(null);
    }

    public BigDecimal doCalculation(Budget budget){
        return BigDecimal.ZERO;
    }

    @Override
    public boolean shouldApply(Budget budget) {
        return true;
    }
}
