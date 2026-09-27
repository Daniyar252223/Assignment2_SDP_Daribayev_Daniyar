package com.pizzeria.products.italian;

import com.pizzeria.model.Pizza;
import java.util.List;

public class MargaritaPizza extends Pizza {
    public MargaritaPizza(){
        super("Margarita", 30, List.of("Mozzarella", "Tomatoes", "Basil"), 12.50, 1);
    }
    @Override
    public void prepare() {
        System.out.println("Rolling out thin Italian dough and arranging fresh basil.");
    }
}
