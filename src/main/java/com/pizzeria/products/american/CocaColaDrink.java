package com.pizzeria.products.american;

import com.pizzeria.model.Drink;

public class CocaColaDrink implements Drink {
    @Override public String getName() { return "Coca-Cola"; }
    @Override public int getVolumeMl() { return 500; }
    @Override public int getTemperatureC() { return 3; }
    @Override public double getPrice() { return 2.50; }
    @Override public void pour() { System.out.println("Pouring carbonated Coca-Cola with ice."); }
}
