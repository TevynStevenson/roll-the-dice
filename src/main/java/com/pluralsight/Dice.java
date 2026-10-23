package com.pluralsight;

public class Dice {


    //generate a number between 1 and 6
    public int Roll(int minValue, int maxValue) {
        int randomNumber = (int) (Math.random() * (maxValue - minValue + 1)) + minValue;
        return randomNumber;


    }


}
