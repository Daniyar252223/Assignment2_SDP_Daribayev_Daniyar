package com.pizzeria.service;

import com.pizzeria.factory.*;

public class ComboFactoryProvider {
    public static FastFoodComboFactory getFactory(String familyName) {
        return switch (familyName.toLowerCase()) {
            case "italian" -> new ItalianComboFactory();
            case "american" -> new AmericanComboFactory();
            case "mexican" -> new MexicanComboFactory();
            case "asian", "fusion" -> new AsianComboFactory();
            default -> throw new IllegalArgumentException("Family: " + familyName);
        };
    }
}
