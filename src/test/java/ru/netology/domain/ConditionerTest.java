package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {
    @Test
    public void shouldNotChangeFields() {
        Conditioner conditioner = new Conditioner();
        assertEquals(0, conditioner.getCurrentTemperature());
        conditioner.setCurrentTemperature(-100);
        assertEquals(0, conditioner.getCurrentTemperature());
    }
    @Test
    public void shouldIncreaseTemperature() {
        Conditioner conditioner = new Conditioner();
        assertEquals(0, conditioner.getCurrentTemperature());
        conditioner.increaseCurrentTemperature(20);
        assertEquals(0, conditioner.getCurrentTemperature());
    }
    @Test
    public void shouldNotIncreaseTemperature() {
        Conditioner conditioner = new Conditioner();
        assertEquals(0, conditioner.getCurrentTemperature());
        conditioner.increaseCurrentTemperature(-10);
        assertEquals(-9, conditioner.getCurrentTemperature());
    }
    @Test
    public void shouldDecreaseTemperature() {
        Conditioner conditioner = new Conditioner();
        assertEquals(0, conditioner.getCurrentTemperature());
        conditioner.decreaseCurrentTemperature(20);
        assertEquals(19, conditioner.getCurrentTemperature());
    }
    @Test
    public void shouldNotDecreaseTemperature() {
        Conditioner conditioner = new Conditioner();
        assertEquals(0, conditioner.getCurrentTemperature());
        conditioner.decreaseCurrentTemperature(0);
        assertEquals(0, conditioner.getCurrentTemperature());
    }
}