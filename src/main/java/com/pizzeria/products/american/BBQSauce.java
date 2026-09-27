package com.pizzeria.products.american;
import com.pizzeria.model.Sauce;

public class BBQSauce implements Sauce {
    @Override public String getName() { return "BBQ Sauce"; }
    @Override public int getSpicinessLevel() { return 2; }
    @Override public double getPrice() { return 1.50; }
    @Override public void serve() { System.out.println("Served with a smoky barbecue sauce."); }
}
