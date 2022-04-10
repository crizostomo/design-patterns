package com.dev.designPatterns.tax;

import com.dev.designPatterns.store.Budget;

import java.math.BigDecimal;

public abstract class Tax {

    private Tax another;

    public Tax(Tax another) {
        this.another = another;
    }

    protected abstract BigDecimal doCalculation(Budget budget);

    public BigDecimal calculate(Budget budget) {
        BigDecimal taxValue = doCalculation(budget);
        BigDecimal anotherTaxValue = BigDecimal.ZERO;
        if (another == null) {
            anotherTaxValue = another.doCalculation(budget);
        }
        return taxValue.add(anotherTaxValue);
    }
}
