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
        radio.setCurrentStation(4);
        radio.nextStation();
        int expected = 5;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);

    }

    @Test
    void prevStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prevStation();
        int expected = 9;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);

    }

    @Test
    void increaseStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(7);
        radio.increaseStation();
        int expected = 8;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);

    }

    @Test
    void decreaseStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(7);
        radio.decreaseStation();
        int expected = 6;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);

    }

    @Test
    void setCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        int expected = 10;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void addVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.addVolume();
        int expected = 6;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);

    }

    @Test
    void minusVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(3);
        radio.minusVolume();
        int expected = 2;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);

    }

    @Test
    void increaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(8);
        radio.increaseVolume();
        int expected = 9;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }
    @Test
    void decreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);

    }

}



