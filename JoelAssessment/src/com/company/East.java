package com.company;

public class East extends Compass{
    public int eastValue;

    public East(int currentPosition, int eastValue){
        super(currentPosition);
        this.eastValue = eastValue;
    }

    @Override
    public void plusOne(){
        eastValue += 1;
    }
}

