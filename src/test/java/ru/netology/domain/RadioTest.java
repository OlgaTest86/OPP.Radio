package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    Radio rad = new Radio(50);
    Radio rad1 = new Radio();

    @Test
    public void shouldGetNumberStation() {
        Radio rad = new Radio(50);
        int expected = 50;
        int actual = rad.getNumberOfStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldGetNumberStationTest() {
        Radio rad1 = new Radio();
        int expected = 10;
        int actual = rad1.getNumberOfStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentStationTest() {
        Radio rad = new Radio(50);
        rad.setCurrentStation(15);
        int expected = 15;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentStationTest1() {
        Radio rad1 = new Radio();
        rad1.setCurrentStation(5);
        int expected = 5;
        int actual = rad1.getCurrentStation();
        assertEquals(expected, actual);
    }



    @Test
    public void shouldSetStationTest1() {
        Radio rad = new Radio(50);
        rad.setCurrentStation(-1);
        int expected = 0;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationTest2() {
        Radio rad1 = new Radio();
        rad1.setCurrentStation(-1);
        int expected = 0;
        int actual = rad1.getCurrentStation();
        assertEquals(expected, actual);
    }



    @Test
    public void shouldTernOnNextStationTest() {
        Radio rad = new Radio(50);
        rad.setCurrentStation(49);
        rad.nextStation();
        int expected = 0;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldTernOnNextStationTest1() {
        Radio rad1 = new Radio();
        rad1.setCurrentStation(9);
        rad1.nextStation();
        int expected = 0;
        int actual = rad1.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnOnPrevStationTest() {
        Radio rad = new Radio(50);
        rad.setCurrentStation(0);
        rad.prevStation();
        int expected = 49;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnOnPrevStationTest1() {
        Radio rad1 = new Radio();
        rad1.setCurrentStation(0);
        rad1.prevStation();
        int expected = 9;
        int actual = rad1.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldShowVolumeLevel() {
        Radio rad1 = new Radio();
        rad.setCurrentVolume(99);
        int expected = 99;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }
    @Test
    public void shouldShowVolumeLevel1() {
        Radio rad1 = new Radio();
        rad.setCurrentVolume(-1);
        int expected = 0;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }
    @Test
    public void shouldShowVolumeLevel2() {
        Radio rad1 = new Radio();
        rad.setCurrentVolume(101);
        int expected = 0;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeLevel() {
        Radio rad1 = new Radio();
        rad.setCurrentVolume(50);
        rad.increaseVolume();
        int expected = 51;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxVolumeLevel() {
        Radio rad1 = new Radio();
        rad.setCurrentVolume(100);
        rad.increaseVolume();
        int expected = 100;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeLevel() {
        Radio rad1 = new Radio();
        rad.setCurrentVolume(65);
        rad.decreaseVolume();
        int expected = 64;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldMinVolumeLevel() {
        Radio rad1 = new Radio();
        rad.decreaseVolume();
        int expected = 0;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }
}







