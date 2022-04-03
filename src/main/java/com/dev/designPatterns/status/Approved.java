package com.dev.designPatterns.status;

import com.dev.designPatterns.DomainException;
import com.dev.designPatterns.store.Budget;

import java.math.BigDecimal;

public class Approved extends BudgetStatus {

    public BigDecimal calculateValueExtraDiscount(Budget budget){
        return budget.getValue().multiply(new BigDecimal("0.02"));
    }

    @Override
    public void finish(Budget budget) {
        budget.setStatus(new Finished());
    }
}
