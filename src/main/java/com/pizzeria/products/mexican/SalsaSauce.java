package com.pizzeria.products.mexican;

import com.pizzeria.model.Sauce;

public class SalsaSauce implements Sauce {
    @Override public String getName() { return "Hot Salsa Sauce"; }
    @Override public int getSpicinessLevel() { return 9; }
    @Override public double getPrice() { return 2.00; }
    @Override public void serve() { System.out.println("Served with salsa in a sauce boat."); }
}
