package com.rydelaney.lessonOne;

import java.util.Scanner;
/**
 * The <code>Payroll</code> class can hold
 * upto 7 employees. This stores the employee
 * data in parallel arrays.
 */
class Payroll {

    //---------------------------------------
    // This array contains all the employee
    // id's for the payroll class.
    //---------------------------------------
    private final int[] employeeId = {5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 7580489};

    private int[] hours;

    private double[] payrate;

    private double[] wages;

    /**
     * This is the default constructor this will instantiate
     * all the other arrays.
     */
    Payroll() {

        // The arrays in this class are parallel
        // to the employeeID array. This makes
        // the other arrays the same size as what
        // they are parallel to.
        hours = new int[employeeId.length];
        payrate = new double[employeeId.length];
        wages = new double[employeeId.length];
    }

    /**
     * This method takes in an employee id and will
     * return the subscript that id corresponds to in
     * the id array.
     *
     * @param id the employee id.
     * @return the corresponding subscript.
     */
    private int getSubscript(int id) {

        // This keeps track of how many times
        // it has run this will contain the
        // subscript.
        int sub = -1;

        // This will iterate thru each element in the
        // array. if it matches it will return the
        // the subscript that corresponds to the id.
        // if nothing matches return -1 meaning no
        // match was found.
        for (int eid : employeeId) {
            sub++;
            if(eid == id){
                return sub;
            }
        }
        // If nothing match return -1.
        return -1;
    }

    /**
     * Enter the employee ID and this will return
     * that employee's gross wage.
     * @param employeeID the id who's gross wage you
     *                   are looking up.
     * @return the employee gross wage.
     */
    private double getWages(int employeeID) {
        return wages[getSubscript(employeeID)];
    }

    void inputEmployeeData(){

        // This creates a Scanner that gets
        // the user's input
        Scanner userInput = new Scanner(System.in);

        for (int index = 0; index <employeeId.length ; index++) {
            // This shows which employee should be inputting their
            // data.
            System.out.println("--- " + employeeId[index] + " ---");

            // This prompts the employee to enter their pay rate
            System.out.println("Enter your pay rate: ");
            payrate[index] = userInput.nextDouble();

            // This checks to make sure they are not inputting a
            // pay that is less then the minimum wage amount of 6
            while(payrate[index] < 6){
                System.out.println("Not a valid pay rate try again:");
                payrate[index] = userInput.nextDouble();
            }

            // This prompts the employee to enter the amount of
            // hours they worked.
            System.out.println("Enter how many hours you worked: ");
            hours[index] = userInput.nextInt();

            // This make sure the hours they worked is not negative.
            while(hours[index] < 0){
                System.out.println("You can't have negative hours try again: ");
                hours[index] = userInput.nextInt();
            }

            wages[index] = hours[index] * payrate[index];
            System.out.println("Employee gross pay: " + getWages(employeeId[index])+"\n");
        }
    }
}
