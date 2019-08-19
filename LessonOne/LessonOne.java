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

        System.out.println("=== Question One ===");
        // This will execute the questionOne Method
        //instance.QuestionOne();

        System.out.println("\n=== Question Nine ===");
        // This will execute the questionNine Method.
        //instance.questionNine();

        System.out.println("\n=== Question Seven ===");
        instance.questionSeven();
    }

    //---------------------------------------
    // Question One Methods
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
            int numChecks = userInput.nextInt();

            // Stores the total amount the user owes the bank.
            float total;

            // If the amount of checks written is less then 20 the user
            // should get charged 10% per check written + base amount.
            if (numChecks < 20) {
                System.out.println("10%");
                total = (float) (baseAmount + (numChecks * 0.10));
            }

            // if the amount of checks are between 20 - 39 the
            // user should get charged 8%.
            else if (numChecks < 40){
                System.out.println("8%");
                total = (float) (baseAmount + (numChecks * 0.08));
            }

            // if the amount of checks are between 20 - 39 the
            // user should get charged 6%.
            else if (numChecks < 60) {
                System.out.println("6%");
                total = (float) (baseAmount + (numChecks * 0.06));
            }

            // If the amount of check written are greater then 60 the user
            // get's charged 4% per check.
            else
                total = (float) (baseAmount + (numChecks * 0.04));

            // This will show the user their service fee.
            System.out.println("Your service fee is : $" + total);

            // This runs if for some reason the scanner was not created.
        } else{
            System.out.println("This is embarrassing but the scanner was not created");
        }
    }

    //---------------------------------------
    // Question Nine Methods
    //---------------------------------------
    /**
     * The QuestionNine method predicts the size of a population.
     * The user enters the starting population the rate at which
     * the population will grow and how long the simulation
     * should run for.
     */
    private void questionNine(){

        // Check to make sure the Scanner is created before
        // trying to use it.
        if(userInput != null){

            // The population stores the current population of the species
            int population;

            // Prompts the user to enter the starting population.
            // The starting population should not be less then 2.
            System.out.println("Enter the starting population");
            population = userInput.nextInt();

            // This make sure the starting population is not less the 2
            // if the population is less then 2 then keep asking them to
            // validate the starting population.
            while(population < 2){
                System.out.println("That is not a valid starting population: ");
                population = userInput.nextInt();
            }

            // Prompts the user to enter the population increase
            // The increase should not be less then 1.
            float repopulatingRatio;
            System.out.println("Enter the population increase: ");
            repopulatingRatio = userInput.nextFloat() / 100;

            // This checks to make sure the user can't enter a negative population
            // increase.  If the user does keep asking them to enter a valid
            // population increase.
            while(repopulatingRatio > 1){
                System.out.println("That is not a valid population increase \ntry again: ");
                repopulatingRatio = userInput.nextInt() / 100;
            }

            // Prompts the user to enter the amount of days the
            // organism has to repopulate. should not be less
            // then 1.
            int runningDays;
            System.out.println("Enter the amount of days they have to repopulate: ");
            runningDays = userInput.nextInt();

            while (runningDays < 1){
                System.out.println("Not a valid amount of days \ntry again: ");
                runningDays = userInput.nextInt();
            }

            for (int currentDay = 0; currentDay <runningDays ; currentDay++) {
                population =(int) (population + (population * repopulatingRatio));
                System.out.println("Day " + currentDay +" population: " + population);
            }

        }else {
            System.out.println("This is embarrassing but the scanner was not created");
        }
    }

    //---------------------------------------
    // Question Seven Methods
    //---------------------------------------
    /**
     * questionSeven method takes
     * in test scores and will  output
     * the grade letter associated
     * with it the number grade.
     */
    private void questionSeven(){

        // Prompts the user to enter the first test grade
        // then stores the input into gradeOne.
        int gradeOne = getGrade();

        // This will take the grade and will tell you the
        // letter grade.
        getLetterGrade(gradeOne);

        // Prompts the user to enter the second test grade
        // then stores the input into gradeTwo.
        int gradeTwo = getGrade();

        // This will take the grade and will tell you the
        // letter grade.
        getLetterGrade(gradeTwo);

        // Prompts the user to enter the third test grade
        // then stores the input into gradeThree.
        int gradeThree = getGrade();

        // This will take the grade and will tell you the
        // letter grade.
        getLetterGrade(gradeThree);

        // Prompts the user to enter the fourth test grade
        // then stores the input into gradeOne.
        int gradeFour = getGrade();

        // This will take the grade and will tell you the
        // letter grade.
        getLetterGrade(gradeFour);

        // Prompts the user to enter the fifth test grade
        // then stores the input into gradeOne.
        int gradeFive = getGrade();

        // This will take the grade and will tell you the
        // letter grade.
        getLetterGrade(gradeThree);

        float gradeAverage = calcAverage(gradeOne, gradeTwo, gradeThree, gradeFour, gradeFive);

        System.out.println("Your grade point Average is : " + gradeAverage);
    }

    /**
     * The calcAverage method takes in 5 test grades then
     * will calculate the average of the five test grades.
     *
     * NOTE: the test grades can't be negative or greater
     * then 100.
     *
     * @param gradeOne the first test grade this grade can't
     *                 be less then 0 or greater then 100.
     *
     * @param gradeTwo the second test grade this grade can't
     *                 be less then 0 or greater then 100.
     *
     * @param gradeThree the third test grade this grade can't
     *                   be less then 0 or greater then 100.
     *
     * @param gradeFour the forth test grade this grade can't
     *                  be less then 0 or greater then 100.
     *
     * @param gradeFive the fifth test grade this grade can't
     *                  be less then 0 or greater then 100.
     */
    private float calcAverage(int gradeOne, int gradeTwo, int gradeThree, int gradeFour, int gradeFive){
        // This will first add all the grades first then divedes by
        return (gradeOne + gradeTwo + gradeThree + gradeFour + gradeFive) / 5;
    }

    /**
     * This method ask the user to enter a grade then checks
     * to make sure the grade enter is valid then will return
     * the grade.
     *
     * @return the grade input by the user.
     */
    private int getGrade(){
        // This will store the result that
        // will be returned.
        int result = -1;

        if(userInput != null) {
            System.out.println("Enter grade: ");
            result = userInput.nextInt();

            while ((result < 0) || (result > 100)) {
                System.out.println("Not a valid grade try again: ");
                result = userInput.nextInt();
            }

            return result;
        }
        return result;
    }

    /**
     * This will take in a grade and will output the letter grade.
     * @param grade the test grade
     */
    private void getLetterGrade(int grade){

        // If the grade is between 90 and 100
        // they got an A.
        if(grade >= 90 && grade <= 100)
            System.out.println("Letter Grade: A");

        // If the grade is between 80 and 89
        // they got an B.
        else if(grade >= 80 && grade < 90)
            System.out.println("Letter Grade: B");

        // If the grade is between 70 and 79
        // they got a b.
        else if(grade >= 70 && grade < 80)
            System.out.println("Letter Grade: C");

        // If the grade is between 60 and 69
        // they got a c.
        else if(grade >= 60 && grade < 70)
            System.out.println("Letter Grade: D");

        // If the grade is less then 60 they got
        // an f. I can do this because the code
        // above checks to make sure the grade
        // range is between 0 and 100.
        else
            System.out.println("Letter Grade F: ");
    }
}
