package com.dev.designPatterns;

import com.dev.designPatterns.budget.BudgetItem;
import com.dev.designPatterns.discount.DiscountCalculator;
import com.dev.designPatterns.budget.Budget;

import java.math.BigDecimal;

public class DiscountTests {
    public static void main(String[] args) {
        Budget first = new Budget();
        first.addItem(new BudgetItem(new BigDecimal("200")));

        Budget second = new Budget();
        second.addItem(new BudgetItem(new BigDecimal("1000")));

        DiscountCalculator calculator = new DiscountCalculator();
        System.out.println(calculator.calculate(first));
        System.out.println(calculator.calculate(second));

    }
}
