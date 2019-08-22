package com.rydelaney.labtwo;

/**
 * The <code>Employee</code> class stores employee information
 * has the ability to modify and return the employee information
 * as well as process their information when needed.
 *
 * @author ryandelaney
 * @version 1.0
 * @see Object
 */
public class Employee {

    //--------------------------------------
    // Attributes
    //--------------------------------------

    // This will hold the name of the employee. This should
    // not be empty.
    private String name;

    // This will hold the id of the employee
    private int idNumber;

    // This stores the department which the employee works at.
    private String Department;

    // Stores what the employee does at their job.
    private String Position;

    //--------------------------------------
    // Telescoping Constructor
    //--------------------------------------

    /**
     * This is the non-args constructor this will create
     * an empty employee object.
     */
    Employee(){
        name = "";
        idNumber = 0;
        Department = "";
        Position = "";
    }

    /**
     * This constructor only has the employee fill out their
     * name and their id number.
     * @param name the employee name
     * @param idNumber the employee id.
     */
    Employee(String name, int idNumber){
        this.name = name;
        this.idNumber = idNumber;
        Department = "";
        Position = "";
    }

    /**
     * This is the constructor requires the employee to enter
     * all their data.
     * @param name the employee name
     * @param idNumber the employee id number
     * @param Department the department they work at.
     * @param Position the position they do.
     */
    Employee(String name, int idNumber, String Department, String Position){
        this.name = name;
        this.idNumber = idNumber;
        this.Department = Department;
        this.Position = Position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String position) {
        Position = position;
    }

    public void showInfo(){
        System.out.println("--- "+ getIdNumber() + "---");
        System.out.println("Name: " + getName());
        System.out.println("Department: "+ getDepartment());
        System.out.println("Position: " + getPosition()+"\n");
    }
}
