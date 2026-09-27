package com.pizzeria.partA;

import com.pizzeria.model.*;
import com.pizzeria.products.italian.*;
import com.pizzeria.products.american.*;
import com.pizzeria.products.mexican.*;

public class LegacyOrderService {
    public void createAndProcessOrder(String family) {
        Pizza pizza;
        Drink drink;
        Sauce sauce;

        if (family.equalsIgnoreCase("Italian")) {
            pizza = new MargaritaPizza();
            drink = new SanPellegrinoDrink();
            sauce = new PestoSauce();
        } else if (family.equalsIgnoreCase("American")) {
            pizza = new PepperoniPizza();
            drink = new CocaColaDrink();
            sauce = new BBQSauce();
        } else if (family.equalsIgnoreCase("Mexican")) {
            pizza = new TacoPizza();
            drink = new JarritosDrink();
            sauce = new SalsaSauce();
        } else {
            throw new IllegalArgumentException("Family: " + family);
        }

        System.out.println("[Legacy]: Order created from products: " + pizza.getName() + ", " + drink.getName() + ", " + sauce.getName());
    }
}
