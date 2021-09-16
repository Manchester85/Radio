package ru.netology.radioman;

public class Radio {
    public int currentStation;
    public int currentVolume;
    private int newStation;
    private int newVolume;
    private int minStation = 0;
    private int maxStation = 9;
    private int minVolume = 0;
    private int maxVolume = 10;

    public void setCurrentStation(int newStation) {
        if ((currentStation <= maxStation) && (currentStation >= minStation)) {

            currentStation = newStation;
        }
        return;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int nextStation(int newStation) {
            this.newStation = newStation;
            if(newStation == maxStation){
              newStation = minStation;
            }
            else{ newStation = newStation + 1;}
            return newStation;
        }


    public void prevStation(int newStation) {
        this.newStation = newStation;
        if(newStation == minStation) {
            newStation = maxStation;
        }
        else { newStation = newStation - 1;}
        return;
    }


    public void setCurrentVolume(int newVolume) {
        if ((currentVolume <= maxVolume) && (currentVolume >= minVolume)) {

            currentVolume = newVolume;
        }
        return;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void addVolume(int newVolume) {
        this.newVolume = newVolume;
        if (newVolume != maxVolume) {
            newVolume = newVolume + 1;
               }
        return;
    }

    public void minusVolume(int newVolume) {
        this.newVolume = newVolume;
        if (newVolume != minVolume) {
            newVolume = newVolume - 1;
                }
        return;
    }
}





