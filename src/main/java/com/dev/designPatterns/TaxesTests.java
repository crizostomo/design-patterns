package com.dev.designPatterns;

import com.dev.designPatterns.store.Budget;
import com.dev.designPatterns.tax.ISS;
import com.dev.designPatterns.tax.TaxesCalculator;

import java.math.BigDecimal;

public class TaxesTests {
    public static void main(String[] args) {
        Budget budget = new Budget(new BigDecimal("100"));
        TaxesCalculator calculator = new TaxesCalculator();
        System.out.println(calculator.calculate(budget, new ISS()));
    }
}

/**
 * STRATEGY PATTERN: Each class has their own implementation, we can use
 * polymorphism with interface, or an abstract class. When we do this we eliminate
 * if and else used excessively
 */
