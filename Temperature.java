package com.rydelaney.labtwo;

public class Temperature {

    //--------------------------------------
    // Attributes
    //--------------------------------------

    // Store the temperature as fahrenheit.
    private double ftemp;

    //--------------------------------------
    // Constructor
    //--------------------------------------

    /**
     * This creates a new Temperature object
     * that takes in a temperature in fahrenheit.
     * @param ftemp the temperature in fahrenheit.
     */
    public Temperature(double ftemp) {
        this.ftemp = ftemp;
    }

    /**
     * Sets the temperature in fahrenheit.
     * @param temp the desired temperature
     */
    public void setFahrenheit(double temp){
        ftemp = temp;
    }

    /**
     * returns the current temperature.
     * @return the current temperature in fahrenheits
     */
    public double getFahrenheit(){
        return ftemp;
    }

    /**
     * You enter a temperature in fahrenheits
     * and it will convert it into celsius.
     * @param temp the temperature you wish to
     *             convert into celsius
     * @return the temperature in celsius.
     */
    public double getCelsius(double temp){
        return (5.0/9.0) *(temp - 32);
    }

    /**
     * You enter a temperature in fahrenheits
     * and it will convert it into Kelvin
     * @param temp the temperature you wish to
     *             convert into kelvin
     * @return the temperature in kelvin.
     */
    public double getKelvin(double temp){
        return (5.0/9.0) * (temp-32) + 273;
    }
}
