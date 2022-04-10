package com.dev.designPatterns.budget;

import java.math.BigDecimal;

public class ProxyBudget extends Budget{

    private BigDecimal value;
    private Budget budget;

    public ProxyBudget(Budget budget) {
        this.budget = budget;
    }

    @Override
    public BigDecimal getValue() {
        if (value == null) {
            this.value = budget.getValue();
        }
        return super.getValue();
    }
}
