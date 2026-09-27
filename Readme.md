# Fast Food Menu Builder(Pizzeria) - Assignment 2 (Factory Method & Abstract Factory)

## Domain Overview
- **Product Types**: Pizza, Drink, Sauce
- **Product Families**:
    1. Italian Family (Margarita, San Pellegrino, Pesto)
    2. American Family (Pepperoni, Coca-Cola, BBQ)
    3. Mexican Family (Taco Pizza, Jarritos, Salsa)
    4. Asian/Fusion Family (Teriyaki Pizza, Matcha Tea, Sweet Chili)

## Part A: Problems Without Factories
1. Tight coupling to concrete classes.
2. Open/Closed Principle violation when adding new families.
3. Risk of mixing incompatible products together.

## Part G: Documenting Changes for 4th Family Extension
When adding the **Asian / Fusion** family, the following files were created/modified:
- **Created**: `TeriyakiPizza.java`, `MatchaTea.java`, `SweetChiliSauce.java`, `AsianComboFactory.java`
- **Modified**: `ComboFactoryProvider.java` (added 1 line to switch statement)
- **Unmodified**: `ComboMealService.java`, all interfaces, and existing tests remained 100% untouched.

## Part I: Automated Tests
15 automated JUnit 5 tests covering family creation, runtime factory selection, business operations, Mexican compatibility rules, and negative scenarios.