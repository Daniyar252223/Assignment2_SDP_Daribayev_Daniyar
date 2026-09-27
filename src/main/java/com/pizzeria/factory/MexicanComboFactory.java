package com.pizzeria.factory;

import com.pizzeria.model.*;
import com.pizzeria.products.mexican.*;

public class MexicanComboFactory implements FastFoodComboFactory {
    @Override public Pizza createPizza() { return new TacoPizza(); }
    @Override public Drink createDrink() { return new JarritosDrink(); }
    @Override public Sauce createSauce() { return new SalsaSauce(); }
}


