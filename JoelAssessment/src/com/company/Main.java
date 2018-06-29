package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        North moveNorth = new North(0,0);
        South moveSouth = new South(0,0);
        East moveEast = new East(0,0);
        West moveWest = new West(0,0);


        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Game");
        System.out.println("Enter your name below:");
        String nameInput = sc.nextLine();
        System.out.println("Hello " + nameInput +"! Find the Magic Box to get out of this dirty swamp");
        System.out.println("Be careful, don't go into the deep side of the swamp!!!");
        System.out.println("Please type 'north','south','east' or 'west' below to navigate throughout the game");

        String input = sc.nextLine();


            if (input.equals("north") && moveNorth.northValue == 0 && moveSouth.southValue == 0
                    && moveEast.eastValue == 0 && moveWest.westValue == 0) {
                moveNorth.plusOne();
                System.out.println("Looks like you are going deeper into the swamp");


            } else if (input.equals("south") && moveNorth.northValue == 0 && moveSouth.southValue == 0
                    && moveEast.eastValue == 0 && moveWest.westValue == 0) {
                moveSouth.plusOne();
                System.out.println("Looks like you are going deeper into the swamp");

            } else if (input.equals("east") && moveNorth.northValue == 0 && moveSouth.southValue == 0
                    && moveEast.eastValue == 0 && moveWest.westValue == 0) {
                moveEast.plusOne();
                System.out.println("You have found the Magic Box");
                System.out.println("Well done " + nameInput + "! You are freeeee!!!! ");

            } else if (input.equals("west") && moveNorth.northValue == 0 && moveSouth.southValue == 0
                    && moveEast.eastValue == 0 && moveWest.westValue == 0) {
                moveWest.plusOne();
                System.out.println("You can see something shining bright... What is it");
            } else {
                System.out.println("Error! ");


            }



    }




}
