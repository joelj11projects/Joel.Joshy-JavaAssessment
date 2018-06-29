package com.company;

public abstract class Compass {


    public int currentPosition;

        public Compass(int currentPosition){
            this.currentPosition = currentPosition;
        }

    public abstract void plusOne();

}
