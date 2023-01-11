package ru.netology.javaqa.Incapsulation.Radio;
public class Radio {

    private int stationNumber;
    private int maxStation;

    public Radio() {
        maxStation = 9;

    }

    public Radio(int stationCount) {
        maxStation = stationCount - 1;

    }

    public int getStationNumber() {
        return stationNumber;
    }

    public void setStationNumber(int nextStationNumber) {
        if (nextStationNumber < 0){
            return;
        }
        if (nextStationNumber >maxStation) {
            return;
        }
        stationNumber = nextStationNumber;
    }

    public void increaseStationNumber() {
        if (stationNumber < maxStation) {
            stationNumber = stationNumber + 1;
        }
        else {
            stationNumber = 0;
        }
    }
    public void previousStationNumber(){
        if (stationNumber > 0) {
            stationNumber = stationNumber - 1;

        }
        else {
            stationNumber = maxStation;
        }
    }

    private int currentVolume;

    public int getVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int nextVolume){
        if (nextVolume < 0) {
            return;
        }
        if (nextVolume > 100){
            return;
        }
        currentVolume = nextVolume;
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
