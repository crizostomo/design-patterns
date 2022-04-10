package com.dev.designPatterns.status;

import com.dev.designPatterns.DomainException;
import com.dev.designPatterns.budget.Budget;

import java.math.BigDecimal;

public abstract class BudgetStatus {

    public BigDecimal calculateValueExtraDiscount(Budget budget){
        return BigDecimal.ZERO;
    }

    public void approve(Budget budget){
        throw new DomainException("This budget cannot be approved!");
    }
    public void deny(Budget budget){
        throw new DomainException("This budget cannot be denied!");
    }
    public void finish(Budget budget){
        throw new DomainException("This budget cannot be finished!");
    }
}
