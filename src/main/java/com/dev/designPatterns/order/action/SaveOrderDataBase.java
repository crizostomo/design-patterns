package com.dev.designPatterns.order.action;

import com.dev.designPatterns.order.Order;

public class SaveOrderDataBase implements ActionAfterOrder{
    public void executeAction(Order order){
        System.out.println("Saving order in data base");
    }
}
