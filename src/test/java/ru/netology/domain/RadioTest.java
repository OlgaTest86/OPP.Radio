package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    public void shouldSetStationTest() {
        Radio rad = new Radio();
        rad.setCurrentStation(5);
        int expected = 5;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }
    @Test
    public void shouldSetStationTest1() {
        Radio rad = new Radio();
        rad.setCurrentStation(-1);
        int expected = 0;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationTest2() {
        Radio rad = new Radio();
        rad.setCurrentStation(15);
        int expected = 0;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldTernOnNextStationTest() {
        Radio rad = new Radio();
        rad.setCurrentStation(9);
        rad.nextStation();
        rad.nextStation();
        int expected = 1;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnOnPrevStationTest() {
        Radio rad = new Radio();
        rad.setCurrentStation(1);
        rad.prevStation();
        rad.prevStation();
        int expected = 9;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldShowVolumeLevel() {
        Radio rad = new Radio();
        rad.setCurrentVolume(5);
        int expected = 5;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }
    @Test
    public void shouldShowVolumeLevel1() {
        Radio rad = new Radio();
        rad.setCurrentVolume(-1);
        int expected = 0;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }
    @Test
    public void shouldShowVolumeLevel2() {
        Radio rad = new Radio();
        rad.setCurrentVolume(15);
        int expected = 0;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeLevel() {
        Radio rad = new Radio();
        rad.setCurrentVolume(5);
        rad.increaseVolume();
        int expected = 6;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxVolumeLevel() {
        Radio rad = new Radio();
        rad.setCurrentVolume(10);
        rad.increaseVolume();
        int expected = 10;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeLevel() {
        Radio rad = new Radio();
        rad.setCurrentVolume(10);
        rad.decreaseVolume();
        int expected = 9;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldMinVolumeLevel() {
        Radio rad = new Radio();
        rad.decreaseVolume();
        int expected = 0;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }
}







