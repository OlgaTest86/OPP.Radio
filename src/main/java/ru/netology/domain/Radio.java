package ru.netology.domain;

public class Radio {

    private int currentStation;
    private int numberOfStation = 10;
    private int currentVolume;

    public Radio(int numberOfStation) {
        this.numberOfStation = numberOfStation;
    }

    public Radio() {
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getNumberOfStation() {
        return numberOfStation;
    }

    public void setNumberOfStation(int numberOfStation) {
        this.numberOfStation = numberOfStation;
    }


    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > (numberOfStation-1)) {
            return;
        }
        this.currentStation = currentStation;
    }

     public void nextStation() {
        int ns = 0;
        if (currentStation < (numberOfStation-1)) {
            ns = currentStation + 1;
        }
        setCurrentStation(ns);

    }

    public void prevStation() {
        int ps = numberOfStation-1;
        if (currentStation > 0) {
            ps = currentStation - 1;
        }
        setCurrentStation(ps);
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }


    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}







