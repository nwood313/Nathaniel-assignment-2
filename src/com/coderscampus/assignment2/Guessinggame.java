package com.coderscampus.assignment2;

import java.util.Random;
import java.util.Scanner;

public class Guessinggame {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int attempts = 5;
        int randomNumber = random.nextInt(1,101) ;
        int attemptsCtr = 0;
        System.out.println("Welcome to the Guessing Game! Pick a number between 1 and 100.");
        //System.out.println(randomNumber); // my way to test winning conditions

        while (attemptsCtr < attempts) {
            System.out.print("Enter your guess: ");
            int yourGuess = scanner.nextInt();

            if (yourGuess < 1 || yourGuess > 100) {
                System.out.println("WHOOPSIE, that number wasn't between 1 & 100. Try again!");
                continue;
            }
            attemptsCtr++;

            if (yourGuess == randomNumber) {
                System.out.println("Winner, Winner, Chicken Dinner!");
                break;
            } else if (yourGuess < randomNumber){
                System.out.println("Please pick a HIGHER number.");

            } else if (yourGuess > randomNumber) {
                System.out.println("Please pick a LOWER number.");
            }

            if ( attemptsCtr < attempts) {
                System.out.println("Try again! You have " + (attempts - attemptsCtr) + " attempts left.");
            } else {
                System.out.println("Oh Brother, WHAT A LOO-SER! The correct number was " + randomNumber + ".");
                System.out.println("GAME OVER!");
            }
        }
        scanner.close();
    }

}
