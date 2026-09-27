package com.pizzeria.factory;

import com.pizzeria.model.Pizza;
import com.pizzeria.model.Drink;
import com.pizzeria.model.Sauce;

public interface FastFoodComboFactory {
    Pizza createPizza();
    Drink createDrink();
    Sauce createSauce();
}
