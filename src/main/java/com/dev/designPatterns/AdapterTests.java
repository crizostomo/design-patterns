package com.dev.designPatterns;

import com.dev.designPatterns.budget.BudgetItem;
import com.dev.designPatterns.http.JavaHttpClient;
import com.dev.designPatterns.budget.Budget;
import com.dev.designPatterns.budget.BudgetRegister;

import java.math.BigDecimal;

public class AdapterTests {
    public static void main(String[] args) {
        Budget budget = new Budget();
        budget.addItem(new BudgetItem(new BigDecimal("200")));
        budget.approve();
        budget.finish();

        BudgetRegister register = new BudgetRegister(new JavaHttpClient());
        register.register(budget);
    }
}
