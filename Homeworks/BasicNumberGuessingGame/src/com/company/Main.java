package com.company;

import java.util.Scanner;

public class Main {

    static int getRandomValue(int minVal, int maxVal) {
        return (int) ((Math.random() * (maxVal - minVal)) + minVal);
    }

    public static void main(String[] args) {

        // Initialised Variables
        int minVal = 1;
        int maxVal = 100;
        int guessVal = getRandomValue(minVal, maxVal);
        boolean run = true;
        int count = 0;

        // Importing Scanner Object
        System.out.println("Number Guessing Game\n("+ minVal + " - " + maxVal + " )");

        Scanner scan = new Scanner(System.in);

        // Main loop
        while (run) {

            System.out.println("Enter a number >> ");
            int input = scan.nextInt();

            if (input == guessVal) {
                run = false;
            } else if (input < guessVal) {
                System.out.println("\nTake an upper value");
                count++;
            } else if (input > guessVal) {
                System.out.println("\nTake an lower value");
                count++;
            }
        }

        // Closing Scanner Object
        scan.close();

        System.out.println(guessVal + " \n\tfounded!\n\ttry : "+count);

    }


}
