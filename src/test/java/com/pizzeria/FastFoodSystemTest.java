package com.pizzeria;

import com.pizzeria.factory.*;
import com.pizzeria.model.*;
import com.pizzeria.products.american.*;
import com.pizzeria.products.asian.*;
import com.pizzeria.products.italian.*;
import com.pizzeria.products.mexican.*;
import com.pizzeria.service.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FastFoodSystemTest {
    @Test
    void testItalianFamilyCreation() {
        FastFoodComboFactory factory = new ItalianComboFactory();
        assertTrue(factory.createPizza() instanceof MargaritaPizza);
        assertTrue(factory.createDrink() instanceof SanPellegrinoDrink);
        assertTrue(factory.createSauce() instanceof PestoSauce);
    }
    @Test
    void testAmericanFamilyCreation() {
        FastFoodComboFactory factory = new AmericanComboFactory();
        assertTrue(factory.createPizza() instanceof PepperoniPizza);
        assertTrue(factory.createDrink() instanceof CocaColaDrink);
        assertTrue(factory.createSauce() instanceof BBQSauce);
    }
    @Test
    void testMexicanFamilyCreation() {
        FastFoodComboFactory factory = new MexicanComboFactory();
        assertTrue(factory.createPizza() instanceof TacoPizza);
        assertTrue(factory.createDrink() instanceof JarritosDrink);
        assertTrue(factory.createSauce() instanceof SalsaSauce);
    }
    @Test
    void testAsianFamilyCreation() {
        FastFoodComboFactory factory = new AsianComboFactory();
        assertTrue(factory.createPizza() instanceof TeriyakiPizza);
        assertTrue(factory.createDrink() instanceof MatchaTea);
        assertTrue(factory.createSauce() instanceof SweetChiliSauce);
    }
    @Test
    void testRuntimeFactorySelectionValid() {
        FastFoodComboFactory factory = ComboFactoryProvider.getFactory("italian");
        assertEquals(MargaritaPizza.class, factory.createPizza().getClass());
    }
    @Test
    void testRuntimeFactorySelectionUnknownFamily() {
        assertThrows(IllegalArgumentException.class, () -> ComboFactoryProvider.getFactory("french"));
    }
    @Test
    void testCalculateComboPriceItalian() {
        ComboMealService service = new ComboMealService(new ItalianComboFactory());
        // Margarita (12.50) + SanPellegrino (3.50) + Pesto (2.00) = 18.00; Скидка 10% = 16.20
        assertEquals(16.20, service.calculateComboPrice(10.0));
    }
    @Test
    void testCalculateComboPriceAsian() {
        ComboMealService service = new ComboMealService(new AsianComboFactory());
        // Teriyaki (15.00) + Matcha (4.50) + SweetChili (1.50) = 21.00; Скидка 20% = 16.80
        assertEquals(16.80, service.calculateComboPrice(20.0));
    }
    @Test
    void testCalculateComboPriceZeroDiscount() {
        ComboMealService service = new ComboMealService(new AmericanComboFactory());
        // Pepperoni (14.00) + Coke (2.50) + BBQ (1.50) = 18.00
        assertEquals(18.00, service.calculateComboPrice(0.0));
    }
    @Test
    void testPrepareComboMealOutput() {
        ComboMealService service = new ComboMealService(new ItalianComboFactory());
        String receipt = service.prepareComboMeal();
        assertTrue(receipt.contains("Margarita"));
        assertTrue(receipt.contains("San Pellegrino Lemonade"));
        assertTrue(receipt.contains("Pesto Sauce"));
    }
    @Test
    void testPrepareComboMealMexicanOutput() {
        ComboMealService service = new ComboMealService(new MexicanComboFactory());
        String receipt = service.prepareComboMeal();
        assertTrue(receipt.contains("Taco Pizza"));
        assertTrue(receipt.contains("Jarritos Lime"));
        assertTrue(receipt.contains("Hot Salsa Sauce"));
    }
    @Test
    void testMexicanSpicinessBonusRule() {
        ComboMealService service = new ComboMealService(new MexicanComboFactory());
        // Base Taco (5) + Salsa (9) + Mexican Bonus (+2) = 16
        assertEquals(16, service.calculateTotalSpiciness());
    }
    @Test
    void testItalianSpicinessWithoutBonus() {
        ComboMealService service = new ComboMealService(new ItalianComboFactory());
        // Base Margarita (1) + Pesto (1) = 2
        assertEquals(2, service.calculateTotalSpiciness());
    }
    @Test
    void testPizzaStoreFactoryMethod() {
        PizzaStore store = new ItalianPizzaStore();
        Pizza pizza = store.orderPizza();
        assertNotNull(pizza);
        assertEquals("Margarita", pizza.getName());
    }
    @Test
    void testClientPolymorphismWithAllFactories() {
        FastFoodComboFactory[] factories = {
                new ItalianComboFactory(),
                new AmericanComboFactory(),
                new MexicanComboFactory(),
                new AsianComboFactory()
        };

        for (FastFoodComboFactory factory : factories) {
            ComboMealService service = new ComboMealService(factory);
            assertTrue(service.calculateComboPrice(5.0) > 0);
            assertNotNull(service.prepareComboMeal());
        }
    }
}
