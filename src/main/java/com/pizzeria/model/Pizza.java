package com.pizzeria.model;
import java.util.List;
public abstract class Pizza {
        protected String name;
        protected int sizeCm;
        protected List<String> ingredients;
        protected double price;
        protected int spiciness;

        public Pizza(String name, int sizeCm, List<String> ingredients, double price, int spiciness) {
            this.name = name;
            this.sizeCm = sizeCm;
            this.ingredients = ingredients;
            this.price = price;
            this.spiciness = spiciness;
        }

        public abstract void prepare();

        public String getName() { return name; }
        public double getPrice() { return price; }
        public int getSpiciness() { return spiciness; }
        public void setSpiciness(int spiciness) { this.spiciness = spiciness;}
}

