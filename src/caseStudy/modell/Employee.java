package caseStudy.modell;

import caseStudy.Validate.Validate;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Employee extends Person {
    String idEmployee;
    String levelStudy;
    String location;
    int salary;

    public String getIdEmployee() {
        return idEmployee;
    }

    public Employee(String fullName, String dayOfBirth, String general, String cmndNumber, String numberCall, String idEmployee, String levelStudy, String location, int salary) {
    }

    public Employee(String fullName, Calendar dayOfBirth, String general, String cmndNumber, String numberCall,String email, String idEmployee,
                    String levelStudy, String location, int  salary) {
        super(fullName, dayOfBirth, general, cmndNumber, numberCall,email);
        this.idEmployee = idEmployee;
        this.levelStudy = levelStudy;
        this.location = location;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "idEmployee='" + idEmployee + '\'' +
                ", levelStudy='" + levelStudy + '\'' +
                ", location='" + location + '\'' +
                ", salary=" + salary +
                ", fullName='" + fullName + '\'' +
                ", dayOfBirth=" + String.format("%d/%d/%d", dayOfBirth.get(Calendar.DATE), dayOfBirth.get(Calendar.MONTH) + 1, dayOfBirth.get(Calendar.YEAR))+
                ", general='" + general + '\'' +
                ", cmndNumber='" + cmndNumber + '\'' +
                ", numberCall='" + numberCall + '\'' +
                ", Email='" + email + '\'' +
                '}';
    }
    public String getInforToCsv()
    {
        return fullName+","+String.format("%d/%d/%d", dayOfBirth.get(Calendar.DATE), dayOfBirth.get(Calendar.MONTH) + 1, dayOfBirth.get(Calendar.YEAR))+","+general+","+cmndNumber+","+numberCall+","+email+","+idEmployee+","+levelStudy+","+location+","+salary;
    }
    public void setIdEmployee(String idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getLevelStudy() {
        return levelStudy;
    }

    public void setLevelStudy(String levelStudy) {
        this.levelStudy = levelStudy;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
