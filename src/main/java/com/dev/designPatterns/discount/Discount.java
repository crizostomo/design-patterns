package com.dev.designPatterns.discount;

import com.dev.designPatterns.store.Budget;

import java.math.BigDecimal;

public abstract class Discount { //The idea is to instantiate the "daughter's class"

    protected Discount next;

    public Discount(Discount next) {
        this.next = next;
    }

    public abstract BigDecimal calculate(Budget budget);

}
