package ru.netology.javaqa.Incapsulation.Radio;
public class Radio {

    private int stationNumber;

    public int getStationNumber() {
        return stationNumber;
    }

    public void setStationNumber(int nextStationNumber) {
        if (nextStationNumber < 0){
            return;
        }
        if (nextStationNumber >9) {
            return;
        }
        stationNumber = nextStationNumber;
    }

    public void increaseStationNumber() {
        if (stationNumber < 9) {
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
            stationNumber = 9;
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
        if (nextVolume > 10){
            return;
        }
        currentVolume = nextVolume;
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
