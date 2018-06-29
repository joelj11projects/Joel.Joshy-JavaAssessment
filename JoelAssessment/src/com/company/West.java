package com.company;

public class West extends Compass{
    public int westValue;

    public West(int currentPosition, int westValue){
        super(currentPosition);
        this.westValue = westValue;
    }

    @Override
    public void plusOne(){
        westValue += 1;
    }
}

