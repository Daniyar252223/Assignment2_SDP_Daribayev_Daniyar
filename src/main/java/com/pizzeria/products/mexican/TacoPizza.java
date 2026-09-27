package com.pizzeria.products.mexican;

import com.pizzeria.model.Pizza;
import java.util.List;

public class TacoPizza extends Pizza {
    public TacoPizza() {
        super("Taco Pizza", 30, List.of("Ground beef", "Jalapeño", "Corn", "Nachos"), 14.00, 5);
    }
    @Override
    public void prepare() {
        System.out.println("Preparing spicy ground meat and frying it with taco spices.");
    }
}
