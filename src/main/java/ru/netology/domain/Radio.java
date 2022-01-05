package ru.netology.domain;

public class Radio {

    private int currentStation;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > 9) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void nextStation() {
        int ns = 0;
        if (currentStation < 9) {
            ns = currentStation + 1;
        }
        setCurrentStation(ns);

    }

    public void prevStation() {
        int ps = 9;
        if (currentStation > 0) {
            ps = currentStation - 1;
        }
        setCurrentStation(ps);
    }

    public int currentVolume;


    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 10) {
            return;
        }
        this.currentVolume = currentVolume;
    }


    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}







