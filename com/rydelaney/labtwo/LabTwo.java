package com.rydelaney.labtwo;

import java.util.Scanner;

/**
 * The <code>LabTwo</code> class will show case all the things
 * required by the lab two homework. This is the entry point
 * for the LabTwo class.
 *
 * @author ryandelaney
 * @version 1.0
 */
public class LabTwo {


    /**
     * The entry point for the program. This will create
     * an instance of the Employee class and run all of
     * the methods need to show case the Employee class.
     * As well as the Temperature class.
     *
     * @param args taken from the
     *             Command Line(Window) or
     *             the Terminal (Mac).
     */

    public static void main(String[] args) {

        // Question One.
        System.out.println("=== Question One ===");
        Employee one = new Employee("Susan Meyers", 47899, "Accounting", "Vice President");
        one.showInfo();

        Employee two = new Employee("Mark Jones", 39119);
        two.setDepartment("IT");
        two.setPosition("Programmer");
        two.showInfo();

        Employee three = new Employee();
        three.setName("Joy Rogers");
        three.setIdNumber(81774);
        three.setDepartment("Manufacturing");
        three.setPosition("Engineer");
        three.showInfo();

        // Question Eight.
        System.out.println("=== Question Eight ===");
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a temperature: ");
        double temp = userInput.nextDouble();
        Temperature temperature = new Temperature(temp);
        System.out.println("Fahrenheit: "+ temperature.getFahrenheit());
        System.out.println("Celsius: " + temperature.getCelsius(temp));
        System.out.println("Kelvin: "+ temperature.getKelvin(temp));
    }
}
