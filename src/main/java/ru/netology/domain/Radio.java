package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Radio {
    private int currentStation;
    private int maxStation=10;
    private int minStation=0;
    private int currentVolume;
    private int maxVolume=100;
    private int minVolume=0;

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

}
