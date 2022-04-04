package com.dev.designPatterns.order.action;

import com.dev.designPatterns.order.Order;

public interface ActionAfterOrder {
    public void executeAction(Order order);
}
