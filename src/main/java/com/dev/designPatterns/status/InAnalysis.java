package com.dev.designPatterns.status;

import com.dev.designPatterns.store.Budget;

import java.math.BigDecimal;

public class InAnalysis extends BudgetStatus {

    public BigDecimal calculateValueExtraDiscount(Budget budget){
        return budget.getValue().multiply(new BigDecimal("0.05"));
    }
    public void approve(Budget budget){
        budget.setStatus(new Approved());
    }
    public void deny(Budget budget){
        budget.setStatus(new Denied());
    }
}
