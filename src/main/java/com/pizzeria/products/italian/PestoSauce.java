package com.pizzeria.products.italian;

import com.pizzeria.model.Sauce;

public class PestoSauce implements Sauce {
    @Override public String getName() { return "Pesto Sauce"; }
    @Override public int getSpicinessLevel() { return 1; }
    @Override public double getPrice() { return 2.00; }
    @Override public void serve() { System.out.println("Served with traditional green pesto sauce.");
    }
}
