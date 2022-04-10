package com.dev.designPatterns;

import com.dev.designPatterns.budget.Budget;
import com.dev.designPatterns.budget.BudgetItem;
import com.dev.designPatterns.tax.ICMS;
import com.dev.designPatterns.tax.ISS;
import com.dev.designPatterns.tax.TaxesCalculator;

import java.math.BigDecimal;

public class TaxesTests {
    public static void main(String[] args) {
        Budget budget = new Budget();
        budget.addItem(new BudgetItem(new BigDecimal("200")));

        TaxesCalculator calculator = new TaxesCalculator();
        System.out.println(calculator.calculate(budget, new ISS(new ICMS(null))));
    }
}
