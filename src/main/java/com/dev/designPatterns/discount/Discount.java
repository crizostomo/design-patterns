package com.dev.designPatterns.discount;

import com.dev.designPatterns.store.Budget;

import java.math.BigDecimal;

public abstract class Discount { //The idea is to instantiate the "daughter's class"

    protected Discount next;

    public Discount(Discount next) {
        this.next = next;
    }

    public BigDecimal calculate(Budget budget){
        if (shouldApply(budget)){
            return doCalculation(budget);
        }
        return next.calculate(budget);
    }

    //protected below to avoid this to be called when stm calls 'Discount'
    protected abstract BigDecimal doCalculation(Budget budget);
    protected abstract boolean shouldApply(Budget budget);

}
