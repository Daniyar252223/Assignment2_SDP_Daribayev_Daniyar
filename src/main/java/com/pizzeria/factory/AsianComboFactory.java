package com.pizzeria.factory;

import com.pizzeria.model.*;
import com.pizzeria.products.asian.*;

public class AsianComboFactory implements FastFoodComboFactory {
    @Override public Pizza createPizza() { return new TeriyakiPizza(); }
    @Override public Drink createDrink() { return new MatchaTea(); }
    @Override public Sauce createSauce() { return new SweetChiliSauce(); }
}
