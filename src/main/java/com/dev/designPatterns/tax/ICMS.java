package com.dev.designPatterns.tax;

import com.dev.designPatterns.store.Budget;

import java.math.BigDecimal;

public class ICMS extends Tax {

    public ICMS(Tax another) {
        super(another);
    }

    public BigDecimal doCalculation(Budget budget){
        return budget.getValue().multiply(new BigDecimal("0.1"));
    }
}
