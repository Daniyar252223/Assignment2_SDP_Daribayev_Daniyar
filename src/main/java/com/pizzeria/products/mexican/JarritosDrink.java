package com.pizzeria.products.mexican;

import com.pizzeria.model.Drink;

public class JarritosDrink implements Drink {
    @Override public String getName() { return "Jarritos Lime"; }
    @Override public int getVolumeMl() { return 370; }
    @Override public int getTemperatureC() { return 4; }
    @Override public double getPrice() { return 3.00; }
    @Override public void pour() { System.out.println("Lime-flavored Mexican Jarritos soda is being poured."); }
}
