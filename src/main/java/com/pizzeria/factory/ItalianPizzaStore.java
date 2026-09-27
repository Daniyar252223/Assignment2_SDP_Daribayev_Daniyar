package com.pizzeria.factory;

import com.pizzeria.model.Pizza;
import com.pizzeria.products.italian.MargaritaPizza;

public class ItalianPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza() {
        return new MargaritaPizza();
    }
}
