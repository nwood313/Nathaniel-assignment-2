package com.coderscampus.assignment2;

import java.util.Random;
import java.util.Scanner;

public class Guessinggame {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int attempts = 5; // Number of allowed attempts
        int random1 = random.nextInt(100+1);

        System.out.println("Welcome to the Guessing Game! Pick a number between 1 and 100.");

        for (int i = 0; i < attempts; i++) {
            System.out.print("Enter your guess: ");
            int userInput = scanner.nextInt();

            if (userInput < random1) {
                System.out.println("Please pick a HIGHER number");
            } else if (userInput > random1) {
                System.out.println("Please pick a LOWER number");
            } else {
                System.out.println("You are the Winner!");
                break;
            }
            if (userInput < 0 || userInput > 100)  {
                System.out.println("Oops, that number wasn't between 1 & 100 try again");
                System.out.println("Try again! You have " + (attempts - i - 0) + " attempts left.");
                continue;
            }
                if (i < attempts - 1) {
                System.out.println("Try again! You have " + (attempts - i - 1) + " attempts left.");
            } else {
                System.out.println("Oh Brother Doug, WHAT A LOSER! . The correct number was " + random1 + ".");
                    System.out.println("GAME OVER!");
            }

        }
    }

}
