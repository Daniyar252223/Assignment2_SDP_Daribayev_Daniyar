package com.pizzeria.products.asian;

import com.pizzeria.model.Pizza;
import java.util.List;

public class TeriyakiPizza extends Pizza {
    public TeriyakiPizza() {
        super("Teriyaki Pizza", 30, List.of("Teriyaki Chicken", "Sesame Seeds", "Teriyaki Sauce", "Cheese"), 15.00, 2);
    }

    @Override
    public void prepare() {
        System.out.println("Marinating the chicken in teriyaki sauce and sprinkling with sesame seeds.");
    }
}
