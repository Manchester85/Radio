package ru.netology.radioman;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {


    @Test
    void setCurrentStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(7);
        int expected = 7;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }
    @Test
    void nextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);

    }

    @Test
    void prevStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        int expected = 9;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);

    }

    @Test
    void setCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);
        int expected = 9;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void addVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        int expected = 2;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);

    }

    @Test
    void minusVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(3);
        int expected = 2;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);

    }
}



