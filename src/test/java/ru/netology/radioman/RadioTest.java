package ru.netology.radioman;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void Radio() {
        Radio radio = new Radio();

    }

    @Test
    void setRadioStation15(){
        Radio radio = new Radio(20);
        radio.setCurrentStation(15);
        int expected = 15;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void setCurrentStationMax() {
        Radio radio = new Radio(10);
        radio.setCurrentStation(11);
        int expected = 9;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void setCurrentStationMin() {
        Radio radio = new Radio(10);
        radio.setCurrentStation(-1);
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void nextStationMax() {
        Radio radio = new Radio(10);
        radio.setCurrentStation(9);
        radio.nextStation();
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);

    }

    @Test
    void nextStationMin() {
        Radio radio = new Radio(10);
        radio.setCurrentStation(0);
        radio.nextStation();
        int expected = 1;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);

    }

    @Test
    void prevStationMin() {
        Radio radio = new Radio(10);
        radio.setCurrentStation(0);
        radio.prevStation();
        int expected = 9;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);

    }

    @Test
    void prevStationMax() {
        Radio radio = new Radio(10);
        radio.setCurrentStation(9);
        radio.prevStation();
        int expected = 8;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);

    }

    @Test
    void increaseStationMax() {
        Radio radio = new Radio(10);
        radio.setCurrentStation(9);
        radio.increaseStation();
        int expected = 9;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);

    }

    @Test
    void increaseStationMin() {
        Radio radio = new Radio(10);
        radio.setCurrentStation(0);
        radio.increaseStation();
        int expected = 1;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);

    }

    @Test
    void decreaseStationMax() {
        Radio radio = new Radio(10);
        radio.setCurrentStation(9);
        radio.decreaseStation();
        int expected = 8;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);

    }

    @Test
    void decreaseStationMin() {
        Radio radio = new Radio(10);
        radio.setCurrentStation(-1);
        radio.decreaseStation();
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);

    }

    @Test
    void setCurrentVolumeMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(102);
        int expected = 100;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void setCurrentVolumeMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        int expected = 1;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void addVolumeMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.addVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);

    }

    @Test
    void addVolumeMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.addVolume();
        int expected = 1;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);

    }

    @Test
    void minusVolumeMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        radio.minusVolume();
        int expected = 98;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);

    }

    @Test
    void minusVolumeMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.minusVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);

    }

    @Test
    void increaseVolumeMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(105);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void increaseVolumeMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.increaseVolume();
        int expected = 1;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void decreaseVolumeMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.decreaseVolume();
        int expected = 99;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);

    }

    @Test
    void decreaseVolumeMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);

    }

}









