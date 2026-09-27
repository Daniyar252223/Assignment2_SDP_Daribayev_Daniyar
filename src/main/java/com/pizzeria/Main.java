package com.pizzeria;

import com.pizzeria.factory.FastFoodComboFactory;
import com.pizzeria.service.ComboMealService;
import com.pizzeria.service.ComboFactoryProvider;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- ABSTRACT FACTORY DEMONSTRATION ---");

        String choosenFamily = "mexican";
        FastFoodComboFactory factory = ComboFactoryProvider.getFactory(choosenFamily);
        ComboMealService service = new ComboMealService(factory);

        System.out.println("\n1. Preparation process:");
        String receipt = service.prepareComboMeal();
        System.out.println("Check: " + receipt);

        System.out.println("\n2. Calculation of the price with a 15% discount:");
        double price = service.calculateComboPrice(15.0);
        System.out.println("Final price: $" + price);

        System.out.println("\n3. Calculation of overall spiciness (including Part D):");
        int spiciness = service.calculateTotalSpiciness();
        System.out.println("Overall combo spiciness: " + spiciness + "/ 20");
    }
}
