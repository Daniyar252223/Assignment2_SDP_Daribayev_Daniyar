package com.pizzeria.model;

public interface Drink {
    String getName();
    int getVolumeMl();
    int getTemperatureC();
    double getPrice();
    void pour();
}