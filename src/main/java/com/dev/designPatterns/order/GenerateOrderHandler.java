package com.dev.designPatterns.order;

import com.dev.designPatterns.order.action.ActionAfterOrder;
import com.dev.designPatterns.store.Budget;

import java.time.LocalDateTime;
import java.util.List;

public class GenerateOrderHandler {

    private List<ActionAfterOrder> actions;

    public GenerateOrderHandler(List<ActionAfterOrder> actions) {
        this.actions = actions;
    }

    public void execute(GenerateOrder data){
        Budget budget = new Budget(data.getBudgetValue(), data.getItemsQuantity());
        Order order = new Order(data.getClient(), LocalDateTime.now(), budget);

        actions.forEach(a -> a.executeAction(order));

    }
}
