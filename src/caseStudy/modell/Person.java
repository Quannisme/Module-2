package caseStudy.modell;

import java.time.LocalDate;

public abstract class Person {
    String fullName;
    LocalDate dayOfBirth;
    String general;
    String cmndNumber;
    @Override
    public String toString() {
        return "Person [fullName=" + fullName + ", dayOfBirth=" + dayOfBirth + ", general=" + general + ", cmndNumber="
                + cmndNumber + ", numberCall=" + numberCall + "]";
    }
    String numberCall;
    public Person(String fullName, LocalDate dayOfBirth, String general, String cmndNumber, String numberCall) {
        this.fullName = fullName;
        this.dayOfBirth = dayOfBirth;
        this.general = general;
        this.cmndNumber = cmndNumber;
        this.numberCall = numberCall;
    }
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public LocalDate getDayOfBirth() {
        return dayOfBirth;
    }
    public void setDayOfBirth(LocalDate dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }
    public Person() {
    }
    public String getGeneral() {
        return general;
    }
    public void setGeneral(String general) {
        this.general = general;
    }
    public String getCmndNumber() {
        return cmndNumber;
    }
    public void setCmndNumber(String cmndNumber) {
        this.cmndNumber = cmndNumber;
    }
    public String getNumberCall() {
        return numberCall;
    }
    public void setNumberCall(String numberCall) {
        this.numberCall = numberCall;
    }
    
}
