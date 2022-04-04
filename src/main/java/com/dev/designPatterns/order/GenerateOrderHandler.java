package com.dev.designPatterns.order;

import com.dev.designPatterns.store.Budget;

import java.time.LocalDateTime;

public class GenerateOrderHandler {

    public void execute(GenerateOrder data){
        Budget budget = new Budget(data.getBudgetValue(), data.getItemsQuantity());

        Order order = new Order(data.getClient(), LocalDateTime.now(), budget);

        System.out.println("Salve order in the data base");
    }
}
