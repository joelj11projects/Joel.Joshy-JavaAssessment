package com.company;

public class North extends Compass{

    public int northValue;

    public North(int currentPosition, int northValue){
        super(currentPosition);
        this.northValue = northValue;
    }

    @Override
    public void plusOne(){
        northValue += 1;
    }

}
