package com.rydelaney.lessonOne;

import java.util.Scanner;

/**
 * The <code>LessonOne</code> class contains all the code
 * for the Lesson One Lab.
 *
 * @author ryandelaney
 * @version 1.0 ALPHA
 */
public class LessonOne {

    // The scanner is used to get the user's
    // input.
    private Scanner userInput;

    /**
     * The main method is the entry point for the
     * LessonOne program.
     * @param args arguments taken from the
     *             Command Line (Window) or
     *             Terminal (Mac OS).
     */
    public static void main(String[] args) {


        // This creates an instance of the LessonOne
        // class so the static method has access to
        // the non-static attributes and methods.
        LessonOne instance = new LessonOne();

        // This will create a scanner that will be used
        // by each method to get the user's keystrokes.
        instance.userInput = new Scanner(System.in);

        // This will execute the questionOne Method
        instance.QuestionOne();

    }

    //---------------------------------------
    // Question One Method
    //---------------------------------------

    /**
     * The QuestionOne() method as the user
     * how many checks they have written for
     * the month then calculates their
     * service fee.
     */
    private void QuestionOne(){

        // Check to make sure the Scanner is created before
        // trying to use it.
        if(userInput != null) {

            // Stores the base amount the bank charges
            // per month. This should not change thus
            // it is final.
            final int baseAmount = 10;

            // This outputs the following message to the user's Command Line or Terminal
            // screen.
            System.out.println("Enter how many checks you have entered this month: ");

            // This will get the user's input and store it into the int below.
            int checkAmount = userInput.nextInt();

            // Stores the total amount the user owes the bank.
            float total;

            // If the amount of checks written is less then 20 the user
            // should get charged 10% per check written + base amount.
            if (checkAmount < 20) {
                System.out.println("10%");
                total = (float) (baseAmount + (checkAmount * 0.10));
            }

            // if the amount of checks are between 20 - 39 the
            // user should get charged 8%.
            else if (checkAmount < 40){
                System.out.println("8%");
                total = (float) (baseAmount + (checkAmount * 0.08));
            }

            // if the amount of checks are between 20 - 39 the
            // user should get charged 6%.
            else if (checkAmount < 60) {
                System.out.println("6%");
                total = (float) (baseAmount + (checkAmount * 0.06));
            }

            // If the amount of checks are greater then 60 the user
            // get's charged 4% per check.
            else
                total = (float) (baseAmount + (checkAmount * 0.04));

            // This will show the user their service fee.
            System.out.println("Your service fee is : $" + total);

        } else{
            System.out.println("This is embarrassing but the scanner was not created");
        }
    }

    private void QuestionNine(){
        
    }
}
