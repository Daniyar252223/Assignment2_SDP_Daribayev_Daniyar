package com.pizzeria.factory;

import com.pizzeria.model.*;
import com.pizzeria.products.italian.*;

public class ItalianComboFactory implements FastFoodComboFactory {
    @Override public Pizza createPizza() { return new MargaritaPizza(); }
    @Override public Drink createDrink() { return new SanPellegrinoDrink(); }
    @Override public Sauce createSauce() { return new PestoSauce(); }
}