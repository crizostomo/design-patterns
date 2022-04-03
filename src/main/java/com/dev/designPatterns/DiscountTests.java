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

/**
 * STRATEGY PATTERN: Each class has their own implementation, we can use
 * polymorphism with interface, or an abstract class. When we do this we eliminate
 * if and else used excessively
 *
 * CHAIN OF RESPONSIBILITY PATTERN: A sequence of responsibilities that verifies
 * if each point needs to apply something. In order to avoid duplication we used
 * inheritance in "mother class" called 'Discount' and abstract method called
 * 'calculate' to ensure that each class own this method called 'calculate'
 *
 * TEMPLATE METHOD PATTERN: This pattern reuses common parts in code avoiding
 * duplicated parts
 *
 * STATE PATTERN: Similar to the 'STRATEGY PATTERN' but it is based on states and
 * their transitions
 */
