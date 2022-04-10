package com.dev.designPatterns.budget;

import com.dev.designPatterns.DomainException;
import com.dev.designPatterns.http.HttpAdapter;

import java.util.Map;

public class BudgetRegister {

    private HttpAdapter http;

    public BudgetRegister(HttpAdapter http) {
        this.http = http;
    }

    public void register(Budget budget){
        if(!budget.isFinished()){
            throw new DomainException("Budget not finished");
        }

        String url = "http://api.external/budget";
        Map<String, Object> data = Map.of(
                "value", budget.getValue(),
                "itemsQuantity", budget.getItemsQuantity()
        );
        http.post(url, data);
    }
}
