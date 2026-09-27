package com.pizzeria.service;

import com.pizzeria.factory.FastFoodComboFactory;
import com.pizzeria.model.Pizza;
import com.pizzeria.model.Drink;
import com.pizzeria.model.Sauce;
import com.pizzeria.products.mexican.SalsaSauce;
import com.pizzeria.products.mexican.TacoPizza;

public class ComboMealService {
    private final FastFoodComboFactory factory;
    public ComboMealService(FastFoodComboFactory factory){
        this.factory = factory;
    }
    public double calculateComboPrice(double discountPercentage) {
        Pizza pizza = factory.createPizza();
        Drink drink = factory.createDrink();
        Sauce sauce = factory.createSauce();

        double totalPrice = pizza.getPrice() + drink.getPrice() + sauce.getPrice();
        double discount = totalPrice * (discountPercentage / 100.0);
        return Math.round((totalPrice - discount) * 100.0) / 100.0;
    }
    public String prepareComboMeal() {
        Pizza pizza = factory.createPizza();
        Drink drink = factory.createDrink();
        Sauce sauce = factory.createSauce();

        pizza.prepare();
        drink.pour();
        sauce.serve();

        return String.format("Being prepared [%s], being poured [%s], being served [%s]",
                pizza.getName(), drink.getName(), sauce.getName());
    }
    public int calculateTotalSpiciness() {
        Pizza pizza = factory.createPizza();
        Sauce sauce = factory.createSauce();

        int totalSpiciness = pizza.getSpiciness() + sauce.getSpicinessLevel();

        //Part D (Mexican Family)
        if (sauce instanceof SalsaSauce && pizza instanceof TacoPizza) {
            pizza.setSpiciness(pizza.getSpiciness() + 2);
            totalSpiciness += 2;
            System.out.println("[Mexican Rule]: SalsaSauce transferred its heat to TacoPizza (+2 to total heat).");
        }
        return totalSpiciness;
    }
}
