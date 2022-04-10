package com.dev.designPatterns.order;

import com.dev.designPatterns.budget.BudgetItem;
import com.dev.designPatterns.order.action.ActionAfterOrder;
import com.dev.designPatterns.budget.Budget;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class GenerateOrderHandler {

    private List<ActionAfterOrder> actionAfterOrders;

    public GenerateOrderHandler(List<ActionAfterOrder> actionAfterOrders) {
        actionAfterOrders = actionAfterOrders;
    }

    public void execute(GenerateOrder data){
        Budget budget = new Budget();
        budget.addItem(new BudgetItem(new BigDecimal("200")));
        Order order = new Order(data.getClient(), LocalDateTime.now(), budget);

        actionAfterOrders.forEach(a -> a.executeAction(order));

    }
}
