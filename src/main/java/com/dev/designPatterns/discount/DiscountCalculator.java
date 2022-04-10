package com.dev.designPatterns.discount;

import com.dev.designPatterns.budget.Budget;

import java.math.BigDecimal;

public class DiscountCalculator {

    public BigDecimal calculate(Budget budget){
        Discount discountChain = new DiscountForMoreThanFiveItems(
          new DiscountForMoreThanFiveHundred(
                  new WithoutDiscount()));

        return discountChain.calculate(budget);
    }
}
