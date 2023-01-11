package ru.netology.javaqa.Incapsulation.Radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetStation() {
        Radio radio = new Radio();

        radio.setStationNumber(10);

        int expected = 0;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldToSetStation() {
        Radio radio = new Radio();

        radio.setStationNumber(-2);

        int expected = 0;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldToAutoStationNumber() {
        Radio radio = new Radio();

        radio.setStationNumber(15);

        int expected = 0;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldToNextStation() {
        Radio radio = new Radio();
        radio.setStationNumber(7);

        radio.increaseStationNumber();

        int expected = 8;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldToUpperStation() {
        Radio radio = new Radio();
        radio.setStationNumber(9);

        radio.increaseStationNumber();

        int expected = 0;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldToPrevStation() {
        Radio radio = new Radio();
        radio.setStationNumber(6);

        radio.previousStationNumber();

        int expected = 5;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldToLowerStation() {
        Radio radio = new Radio();
        radio.setStationNumber(0);

        radio.previousStationNumber();

        int expected = 9;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);

        int expected = 100;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldToHoldUpper() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldToUpVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);

        radio.increaseVolume();

        int expected = 60;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldToDecreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);

        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldToHoldLowerVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldToVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(101);

        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldToSetVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldToPreMaxStation() {
        Radio radio = new Radio(20);

        radio.setStationNumber(19);

        int expected = 19;
        int actual = radio.getStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldToPreMinStation() {
        Radio radio = new Radio(20);

        radio.setStationNumber(1);

        int expected = 1;
        int actual = radio.getStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldToOverStation() {
        Radio radio = new Radio(20);

        radio.setStationNumber(21);

        int expected = 0;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldToLowerBorderStation() {
        Radio radio = new Radio(20);

        radio.setStationNumber(-1);

        int expected = 0;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldToMidleBorderStation() {
        Radio radio = new Radio(20);

        radio.setStationNumber(10);

        int expected = 10;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

}
