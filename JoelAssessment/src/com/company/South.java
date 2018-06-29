package com.company;

public class South extends Compass{
    public int southValue;

    public South(int currentPosition, int southValue){
        super(currentPosition);
        this.southValue = southValue;
    }

    @Override
    public void plusOne(){
        southValue += 1;
    }
}
