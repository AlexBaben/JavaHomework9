package ru.netology;

public class Radio {
    private int currentStation;
    private int minStation = 0;
    private int amountStations = 10;
    private int currentVolume;

    public Radio(int amountStations) {
        this.amountStations = amountStations;
    }

    public Radio() {
    }

    public int getAmountStations() {
        return amountStations;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < minStation) {
            return;
        }
        if (newCurrentStation > amountStations - 1) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void nextStation() {
        if (currentStation < amountStations - 1) {
            currentStation = currentStation + 1;
        } else {
            currentStation = 0;
        }
    }

    public void prevStation() {
        if (currentStation > 0) {
            currentStation = currentStation - 1;
        } else {
            currentStation = amountStations - 1;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void plusVolume() {
        if (currentVolume == 100) {
            return;
        } else {
            currentVolume = currentVolume + 1;
        }
    }

    public void minusVolume() {
        if (currentVolume == 0) {
            return;
        } else {
            currentVolume = currentVolume - 1;
        }
    }
}