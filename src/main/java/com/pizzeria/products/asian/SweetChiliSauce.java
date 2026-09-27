package com.pizzeria.products.asian;

import com.pizzeria.model.Sauce;

public class SweetChiliSauce implements Sauce {
    @Override public String getName() { return "Сладкий Чили соус"; }
    @Override public int getSpicinessLevel() { return 4; }
    @Override public double getPrice() { return 1.50; }
    @Override public void serve() { System.out.println("Подача Сладкого Чили в пиале."); }
}
