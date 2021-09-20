package ru.netology.radioman;

public class Radio {

    private int newStation;
    private int newVolume;
    private int minStation = 0;
    private int maxStation = 9;
    private int minVolume = 0;
    private int maxVolume = 10;

    public void setCurrentStation(int newStation) {
        if ((newStation > maxStation) && (newStation < minStation)) {
            return;
        }
        this.newStation = newStation;
    }


    public int getCurrentStation() {
        return newStation;
    }

    public void nextStation() {
        if (newStation == maxStation) {
            newStation = minStation;
        } else {
            newStation = newStation + 1;
        }
        return;
    }


    public void prevStation() {
        if (newStation == minStation) {
            newStation = maxStation;
        } else {
            newStation = newStation - 1;
        }
        return;
    }

    public void increaseStation() {
        if (newStation < maxStation) {
            newStation = newStation + 1;
        }
        return;
    }

    public void decreaseStation() {
        if (newStation > minStation) {
            newStation = newStation - 1;
        }
        return;
    }

    public void setCurrentVolume(int newVolume) {
        if ((newVolume > maxVolume) && (newVolume < minVolume)) {
            return;
        }
        this.newVolume = newVolume;
    }


    public int getCurrentVolume() {
        return newVolume;
    }

    public void addVolume() {
        if (newVolume != maxVolume) {
            newVolume = newVolume + 1;
        }
        return;
    }

    public void minusVolume() {
        if (newVolume != minVolume) {
            newVolume = newVolume - 1;
        }
        return;
    }

    public void increaseVolume() {
        if (newVolume < maxVolume) {
            newVolume = newVolume + 1;
        }
        return;
    }


    public void decreaseVolume() {
        if (newVolume > minVolume) {
            newVolume = newVolume - 1;
        }
            return;
        }
    }






