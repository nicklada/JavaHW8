package ru.netology.domain;

public class Radio {
    private int currentStation;
    private int maxStation;
    private int minStation;
    private int currentVolume;

    public void setMaxStation(int maxStation) {
        this.maxStation = maxStation;
    }

    public void setMinStation(int minStation) {
        this.minStation = minStation;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    private int maxVolume;
    private int minVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            return;
        }
        if (currentStation < minStation) {
            return;
        }
        this.currentStation = currentStation;
    }
    public void setNextStation() {
        int nextStation = currentStation+1;
        if (nextStation > maxStation) {
           this.currentStation = minStation;
        }
        else
        this.currentStation = nextStation;
    }
    public void setPreviousStation() {
        int previousStation = currentStation-1;
        if (previousStation < minStation) {
            this.currentStation = maxStation;
        }
        else
        this.currentStation = previousStation;
    }

    public int getMaxStation() {

        return maxStation;
    }


    public int getMinStation() {
        return minStation;
    }



    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }
    public void increaseCurrentVolume() {
        int nextVolume = currentVolume+1;
        if (nextVolume > maxVolume) {
            return;
        }
        this.currentVolume = nextVolume;
    }
    public void decreaseCurrentVolume() {
        int previousVolume = currentVolume-1;
        if (previousVolume < minVolume) {
          return;
        }
        else
        this.currentVolume = previousVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }


    public int getMinVolume() {
        return minVolume;
    }

}
