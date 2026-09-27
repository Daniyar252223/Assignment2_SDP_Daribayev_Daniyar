package com.pizzeria.factory;

import com.pizzeria.model.*;
import com.pizzeria.products.american.*;

public class AmericanComboFactory implements FastFoodComboFactory {
    @Override public Pizza createPizza() { return new PepperoniPizza(); }
    @Override public Drink createDrink() { return new CocaColaDrink(); }
    @Override public Sauce createSauce() { return new BBQSauce(); }
}