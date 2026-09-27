package com.pizzeria.products.italian;

import com.pizzeria.model.Drink;

public class SanPellegrinoDrink implements Drink {
    @Override public String getName() { return "San Pellegrino Lemonade"; }
    @Override public int getVolumeMl() { return 500; }
    @Override public int getTemperatureC() { return 5; }
    @Override public double getPrice() { return 3.50; }
    @Override public void pour() { System.out.println("Chilled San Pellegrino with lemon is being poured.");}
}

