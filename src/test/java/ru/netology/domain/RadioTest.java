package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    Radio radio = new Radio();

    @Test
    public void shouldSetDefaultNumberOfStations() {
        int expected = 10;
        assertEquals(expected, radio.getMaxStation());
    }

    @Test
    public void shouldSetNumberOfStations() {
        radio.setMaxStation(30);
        assertEquals(30, radio.getMaxStation());
    }

    @Test
    public void shouldNotSetStation() {
        Radio radio = new Radio();
        radio.setMaxStation(5);
        radio.setCurrentStation(6);
        assertEquals(0, radio.getCurrentStation());
        radio.setCurrentStation(-1);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldSetStation() {
        Radio radio = new Radio();
        radio.setMaxStation(50);
        radio.setCurrentStation(25);
        assertEquals(25, radio.getCurrentStation());
    }

    @Test
    public void shouldSetNextStation() {
        radio.setMaxStation(50);
        radio.setCurrentStation(15);
        radio.setNextStation();
        assertEquals(16, radio.getCurrentStation());
    }

    @Test
    public void shouldSetPreviousStation() {
        radio.setMaxStation(50);
        radio.setCurrentStation(15);
        radio.setPreviousStation();
        assertEquals(14, radio.getCurrentStation());
    }

    @Test
    public void shouldSetMinStation() {
        radio.setMaxStation(30);
        radio.setCurrentStation(30);
        radio.setNextStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldSetMaxStation() {
        Radio radio = new Radio();
        radio.setMaxStation(20);
        radio.setCurrentStation(0);
        radio.setPreviousStation();
        assertEquals(20, radio.getCurrentStation());
    }

    @Test
    public void shouldNotIncreaseVolume() {
        radio.setCurrentVolume(100);
        radio.increaseCurrentVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldNotDecreaseVolume() {
        radio.setCurrentVolume(0);
        radio.decreaseCurrentVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetNextVolume() {
        radio.setCurrentVolume(5);
        radio.increaseCurrentVolume();
        assertEquals(6, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetPreviousVolume() {
        radio.setCurrentVolume(5);
        radio.decreaseCurrentVolume();
        assertEquals(4, radio.getCurrentVolume());
    }

    @Test
    public void shouldNotSetVolume() {
        radio.setCurrentVolume(101);
        assertEquals (0, radio.getCurrentVolume());
        radio.setCurrentVolume(-1);
        assertEquals (0, radio.getCurrentVolume());
    }

}