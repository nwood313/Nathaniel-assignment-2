package com.coderscampus.assignment2;

import java.util.Random;
import java.util.Scanner;

public class Guessinggame {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Enter a number between 1 & 100");
        String number = scanner.nextLine();
        System.out.println("Type in Your Age");
        String age = scanner.nextLine();
        if (random.equals("Michael Jacobs")
                || age .equals("32")) {
            System.out.println("Why are you weird?");
            System.out.println("You are weird!");
        }   else
        {System.out.println("Hello:" + number);
        }


    }

}
