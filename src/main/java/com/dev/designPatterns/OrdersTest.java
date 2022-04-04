package com.dev.designPatterns;

import com.dev.designPatterns.order.GenerateOrder;
import com.dev.designPatterns.order.GenerateOrderHandler;

import java.math.BigDecimal;

public class OrdersTest {
    public static void main(String[] args) {
        String client = args[0];
        BigDecimal budgetValue = new BigDecimal(args[1]);
        int itemsQuantity = Integer.parseInt(args[2]);

        GenerateOrder generator = new GenerateOrder(client, budgetValue, itemsQuantity);
        GenerateOrderHandler handler = new GenerateOrderHandler();
        handler.execute(generator);
    }
}
