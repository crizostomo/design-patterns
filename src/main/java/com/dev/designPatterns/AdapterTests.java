package com.dev.designPatterns;

import com.dev.designPatterns.http.JavaHttpClient;
import com.dev.designPatterns.store.Budget;
import com.dev.designPatterns.store.BudgetRegister;

import java.math.BigDecimal;

public class AdapterTests {
    public static void main(String[] args) {
        Budget budget = new Budget(BigDecimal.TEN, 1);
        budget.approve();
        budget.finish();

        BudgetRegister register = new BudgetRegister(new JavaHttpClient());
        register.register(budget);
    }
}
