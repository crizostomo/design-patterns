package com.dev.designPatterns.order.action;

import com.dev.designPatterns.order.Order;

public class SendEmailOrder implements ActionAfterOrder {
    public void executeAction(Order order){
        System.out.println("Sending e-mail with more details about your order");
    }
}
