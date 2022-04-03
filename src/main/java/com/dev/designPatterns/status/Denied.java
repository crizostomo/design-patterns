package com.dev.designPatterns.status;

import com.dev.designPatterns.store.Budget;

import java.math.BigDecimal;

public class Denied extends BudgetStatus {

    public void finish(Budget budget){
        budget.setStatus(new Finished());
    }
}
