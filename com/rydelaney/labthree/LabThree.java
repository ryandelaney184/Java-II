package com.rydelaney.labthree;

import java.util.Scanner;

public class LabThree {

    public static void main(String[] args) {

        // Creates an instance of the LabThree class
        // so the main can access the non static
        // methods.
        LabThree instance = new LabThree();

        // This tells the user this is part of the
        // first quesiton.
        System.out.println("--- Question One ---");

        // This creates an instance of the scanner
        // so the program can have access to the
        // user's input.
        Scanner userInput = new Scanner(System.in);

        // Prompts the user to enter a password then
        // Stores it.
        System.out.println("Enter a password");
        String pass = userInput.nextLine();

        // This passes the input into the Password
        // object to see if the password is valid or
        // not.
        Password password = new Password(pass);
        System.out.println("\n");

        // Tells the user their on the second questions
        System.out.println("--- Question Two ---");

        // Prompts the user to enter a string of numbers
        // then stores the user's input.
        System.out.println("Enter a number");
        String numbers = userInput.nextLine();

        // This will print out the result.
        System.out.println("Sum:" + instance.sum(numbers));
    }

    /**
     * Enter a string of numbers ranging from 0-9.
     * The numbers do not need any separator.
     *
     * @param numbers the numbers you want the sum
     *                of
     * @return the sum of the numbers entered.
     */
    private int sum(String numbers){

        // Stores the sum of all the numbers added
        // together.
        int result = 0;

        // Stores the highest number in the array.
        int hight = 0;

        // Stores the lowest number in the array.
        int low = 9;

        // This will split the String by the empty spaces
        // between each character.
        String[] splitNumbers = numbers.split("");

        // Goes through each iteration of the string array.
        for (String element: splitNumbers) {

            // Gets the integer value from the String.
            // So it can be used to add to the sum.
            int converted = Integer.parseInt(element);

            // If the current number is greater then the
            // current highest number then replace it will
            // the converted number.
            if(converted > hight){
                hight = converted;
            }

            // If the current number is less then the lowest
            // number then replace it.
            if(converted < low){
                low = converted;
            }

            result += converted;
        }

        System.out.println("Highest number: "+ hight);
        System.out.println("Lowest Number: " + low);
        return result;
    }
}
