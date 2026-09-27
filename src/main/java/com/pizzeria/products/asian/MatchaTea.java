package com.pizzeria.products.asian;

import com.pizzeria.model.Drink;

public class MatchaTea implements Drink {
    @Override public String getName() { return "Cold Matcha Tea"; }
    @Override public int getVolumeMl() { return 400; }
    @Override public int getTemperatureC() { return 4; }
    @Override public double getPrice() { return 4.50; }
    @Override public void pour() { System.out.println("Whisking matcha with coconut milk."); }
}

