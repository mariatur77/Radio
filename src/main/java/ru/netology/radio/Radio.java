package ru.netology.radio;

public class Radio {
    private int maxStation = 9;
    private int minStation = 0;
    private int currentStation = minStation;


    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume = minVolume;


    public Radio(int stationCount) {
        this.minStation = 0;
        this.maxStation = stationCount - 1;
        this.currentStation = minStation;

        this.minVolume = 0;
        this.maxVolume = 100;
        this.currentVolume = minVolume;

    }

    public Radio () {


    }


    public void next() {
        if (currentStation != maxStation) {
            currentStation++;
        } else {
            currentStation = minStation;
        }
    }

    public void prev() {
        if (currentStation != minStation) {
            currentStation--;
            return;
        } else {
            currentStation = maxStation;
        }

    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < minStation) {
            return;
        }
        if (currentStation > maxStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = maxVolume;
        }
    }


    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = minVolume;
        }
    }
}

