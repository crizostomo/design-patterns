package com.dev.designPatterns;

import com.dev.designPatterns.order.GenerateOrder;
import com.dev.designPatterns.order.GenerateOrderHandler;
import com.dev.designPatterns.order.action.SaveOrderDataBase;
import com.dev.designPatterns.order.action.SendEmailOrder;

import java.math.BigDecimal;
import java.util.Arrays;

public class OrdersTest {
    public static void main(String[] args) {
        String client = "Rodrigo";
        BigDecimal budgetValue = new BigDecimal("300");
        int itemsQuantity = Integer.parseInt("2");

        GenerateOrder generator = new GenerateOrder(client, budgetValue, itemsQuantity);
        GenerateOrderHandler handler = new GenerateOrderHandler(
                Arrays.asList(new SaveOrderDataBase(),
                new SendEmailOrder()
        ));
        handler.execute(generator);
    }
}
