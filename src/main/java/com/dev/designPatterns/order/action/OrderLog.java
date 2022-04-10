package com.dev.designPatterns.order.action;

import com.dev.designPatterns.order.Order;

public class OrderLog implements ActionAfterOrder {
    @Override
    public void executeAction(Order order) {
        System.out.println("Order was generated: " + order);
    }
}
