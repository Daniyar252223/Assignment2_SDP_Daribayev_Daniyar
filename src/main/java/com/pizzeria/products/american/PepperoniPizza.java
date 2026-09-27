package com.pizzeria.products.american;

import com.pizzeria.model.Pizza;
import java.util.List;

public class PepperoniPizza extends Pizza {
    public PepperoniPizza(){
        super("Pepperoni", 35, List.of("Pepperoni", "Mozzarella Cheese", "Tomato Sauce"), 14.00, 3);
    }
    @Override
    public void prepare() {
        System.out.println("Preparing the fluffy American-style dough and arranging the pepperoni slices.");
    }
}
