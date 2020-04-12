package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    public void shouldNotChangeStationMore() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentStation());
        radio.setCurrentStation(100);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldNotChangeStationLess() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentStation());
        radio.setCurrentStation(-5);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldChangeStation() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentStation());
        radio.setCurrentStation(5);
        assertEquals(5, radio.getCurrentStation());
    }

    @Test
    public void shouldSetNextStation() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentStation());
        radio.setNextStation(5);
        assertEquals(6, radio.getCurrentStation());
    }

    @Test
    public void shouldSetMinStation() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentStation());
        radio.setNextStation(10);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldSetPreviousStation() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentStation());
        radio.setPreviousStation(5);
        assertEquals(4, radio.getCurrentStation());
    }

    @Test
    public void shouldSetMaxStation() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentStation());
        radio.setPreviousStation(0);
        assertEquals(10, radio.getCurrentStation());
    }

    @Test
    public void shouldNotIncreaseVolume() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentVolume());
        radio.setCurrentVolume(100);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldNotDecreaseVolume() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentVolume());
        radio.setCurrentVolume(-5);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetVolume() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentVolume());
        radio.setCurrentVolume(5);
        assertEquals(5, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetNextVolume() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentVolume());
        radio.increaseCurrentVolume(5);
        assertEquals(6, radio.getCurrentVolume());
    }

    @Test
    public void shouldNotSetNextVolume() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentVolume());
        radio.increaseCurrentVolume(10);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetPreviousVolume() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentVolume());
        radio.decreaseCurrentVolume(5);
        assertEquals(4, radio.getCurrentVolume());
    }

    @Test
    public void shouldNotSetPreviousVolume() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentVolume());
        radio.decreaseCurrentVolume(0);
        assertEquals(0, radio.getCurrentVolume());

    }
}