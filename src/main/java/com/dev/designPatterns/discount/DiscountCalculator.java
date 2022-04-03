package com.dev.designPatterns.discount;

import com.dev.designPatterns.store.Budget;

import java.math.BigDecimal;

public class DiscountCalculator {

    public BigDecimal calculate(Budget budget){
        Discount discount = new DiscountForMoreThanFiveItems(
          new DiscountForMoreThanFiveHundred(
                  new WithoutDiscount()));

        return discount.calculate(budget);
    }
}
