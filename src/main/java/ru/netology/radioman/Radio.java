package ru.netology.radioman;


public class Radio {


    private int quantityStation = 10;
    private int newStation;
    private int newVolume;
    private int minStation = 0;
    private int maxStation = 9;
    private int minVolume = 0;
    private int maxVolume = 100;

    //без параметров
    public Radio() {
    }

    public Radio(int quantityStation) {
    }

    public void setCurrentStation(int newStation) {
        if (newStation > maxStation) {
            newStation = maxStation;

        }
        if (newStation < minStation) {
            newStation = minStation;

        }

        this.newStation = newStation;
    }

    public int getCurrentStation() {
        return newStation;
    }


    public void nextStation() {
        if (newStation < maxStation) {
            newStation = newStation + 1;
        }
        if (newStation == maxStation) {
            newStation = minStation;
        }
        this.newStation = newStation;
    }

    public void prevStation() {
        if (newStation > minStation){
            newStation = newStation -1;
        }
        if (newStation == minStation) {
            newStation = maxStation;
        }

        this.newStation = newStation;
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
        if (newVolume > maxVolume) {
            newVolume = maxVolume;

        }
        if (newVolume < minVolume) {
            newVolume = minVolume;

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
    }


    public void decreaseVolume() {
        if (newVolume > minVolume) {
            newVolume = newVolume - 1;
        }

    }
}






