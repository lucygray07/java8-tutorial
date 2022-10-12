package com.java8.study;

import java.util.Date;

public class Employee
{
    private int id;
    private String employeeName;
    private String employeeGender;
    private double employeeSalary;
    private int yearOfJoining;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeGender() {
        return employeeGender;
    }

    public void setEmployeeGender(String employeeGender) {
        this.employeeGender = employeeGender;
    }

    public int getYearOfJoining() {
        return yearOfJoining;
    }

    public void setYearOfJoining(int yearOfJoining) {
        this.yearOfJoining = yearOfJoining;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public Employee(int id, String employeeName, String employeeGender, double employeeSalary, int yearOfJoining) {
        this.id = id;
        this.employeeName = employeeName;
        this.employeeGender = employeeGender;
        this.employeeSalary = employeeSalary;
        this.yearOfJoining = yearOfJoining;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", employeeName='" + employeeName + '\'' +
                ", employeeGender='" + employeeGender + '\'' +
                ", employeeSalary=" + employeeSalary +
                ", yearOfJoining=" + yearOfJoining +
                '}';
    }
}
