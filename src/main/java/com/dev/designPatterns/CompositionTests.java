package com.dev.designPatterns;

import com.dev.designPatterns.budget.Budget;
import com.dev.designPatterns.budget.BudgetItem;

import java.math.BigDecimal;

public class CompositionTests {
    public static void main(String[] args) {
        Budget former = new Budget();
        former.addItem(new BudgetItem(new BigDecimal("200")));
        former.deny();

        Budget newer = new Budget();
        newer.addItem(new BudgetItem(new BigDecimal("500")));
        newer.addItem(former);

        System.out.println(newer.getValue());

    }
}
