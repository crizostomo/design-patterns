package com.dev.designPatterns.status;

import com.dev.designPatterns.budget.Budget;

public class Denied extends BudgetStatus {

    public void finish(Budget budget){
        budget.setStatus(new Finished());
    }
}
