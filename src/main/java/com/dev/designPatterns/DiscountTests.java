package com.dev.designPatterns;

import com.dev.designPatterns.discount.DiscountCalculator;
import com.dev.designPatterns.store.Budget;
import com.dev.designPatterns.tax.ISS;
import com.dev.designPatterns.tax.TaxesCalculator;

import java.math.BigDecimal;

public class DiscountTests {
    public static void main(String[] args) {
        Budget first = new Budget(new BigDecimal("200"), 6);
        Budget second = new Budget(new BigDecimal("1000"), 1);

        DiscountCalculator calculator = new DiscountCalculator();
        System.out.println(calculator.calculate(first));
        System.out.println(calculator.calculate(second));

    }
}
