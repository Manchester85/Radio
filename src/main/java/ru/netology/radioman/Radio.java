package ru.netology.radioman;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class Radio {


    private int quantityStation = 10;
    private int newStation;
    private int newVolume;
    private int minStation = 0;
    private int maxStation = 10;
    private int minVolume = 0;
    private int maxVolume = 100;

    public Radio(int newStation, int newVolume, int minStation, int maxStation, int minVolume, int maxVolume) {
        this.newStation = newStation;
        this.newVolume = newVolume;
        this.minStation = minStation;
        this.maxStation = maxStation;
        this.minVolume = minVolume;
        this.maxVolume = maxVolume;
    }

    public Radio(int quantityStation) {
        this.quantityStation = quantityStation;
    }
    public void setCurrentStation(int newStation) {
        if (newStation < maxStation) {

        }
        if (newStation > minStation) {

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
        if (newVolume < maxVolume) {

        }
        if (newVolume > minVolume) {

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






