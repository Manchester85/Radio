package ru.netology.radioman;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void shouldUseConstructor(){
        Radio radio = new Radio( 0, 0, 0, 10, 0, 10);
    }


    @Test
    void shouldSetQuantityOfStations(){
        Radio radio = new Radio(10);

    }


    @Test
    void setCurrentStationMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(7);
        int expected = 7;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void setCurrentStationMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void nextStationMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        radio.nextStation();
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);

    }
    @Test
    void nextStationMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(4);
        radio.nextStation();
        int expected = 5;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);

    }

    @Test
    void prevStationMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prevStation();
        int expected = 10;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);

    }
    @Test
    void prevStationMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.prevStation();
        int expected = 8;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);

    }

    @Test
    void increaseStationMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.increaseStation();
        int expected = 10;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);

    }
    @Test
    void increaseStationMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        radio.increaseStation();
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);

    }

    @Test
    void decreaseStationMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        radio.decreaseStation();
        int expected = 9;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);

    }

    @Test
    void decreaseStationMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.decreaseStation();
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);

    }

    @Test
    void setCurrentVolumeMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        int expected = 100;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void setCurrentVolumeMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        int expected = 0;
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
        radio.setCurrentVolume(100);
        radio.minusVolume();
        int expected = 99;
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
        radio.setCurrentVolume(100);
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
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);

    }

}



