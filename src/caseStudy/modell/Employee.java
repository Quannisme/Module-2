package caseStudy.modell;

import java.time.LocalDate;

public class Employee extends Person {
    String idEmployee;
    String levelStudy;
    String location;
    double salary;
    public String getIdEmployee() {
        return idEmployee;
    }
    public Employee() {
    }
    public Employee(String fullName, LocalDate dayOfBirth, String general, String cmndNumber, String numberCall, String idEmployee,
            String levelStudy, String location, double salary) {
        super(fullName, dayOfBirth, general, cmndNumber, numberCall);
        this.idEmployee = idEmployee;
        this.levelStudy = levelStudy;
        this.location = location;
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Employee [idEmployee=" + idEmployee + ", levelStudy=" + levelStudy + ", location=" + location
                + ", salary=" + salary + "]";
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
    public void setSalary(double salary) {
        this.salary = salary;
    }

}
