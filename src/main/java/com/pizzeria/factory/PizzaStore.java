package com.pizzeria.factory;

import com.pizzeria.model.Pizza;

public abstract class PizzaStore {
    protected abstract Pizza createPizza();

    public Pizza orderPizza() {
        Pizza pizza = createPizza();
        System.out.println("---Starting pizza preparation using the Factory Method---");
        pizza.prepare();
        bake();
        cut();
        box();
        return pizza;
    }

    private void bake() { System.out.println("Bake for 15 minutes at 220°C..."); }
    private void cut() { System.out.println("Cutting into pieces..."); }
    private void box() { System.out.println("Packaging in a branded box..."); }
}