package caseStudy.modell;

import java.time.LocalDate;
import java.util.Calendar;

public abstract class Person {
    String fullName;
    Calendar dayOfBirth;
    String general;
    String cmndNumber;
    String email;

    @Override
    public String toString() {
        return "Person [fullName=" + fullName + ", dayOfBirth=" + String.format("%d/%d/%d", dayOfBirth.get(Calendar.DATE),dayOfBirth.get(Calendar.MONTH)+1,dayOfBirth.get(Calendar.YEAR)) + ", general=" + general + ", cmndNumber="
                + cmndNumber + ", numberCall=" + numberCall + "Email=" + email + "]";
    }

    String numberCall;

    public Person(String fullName, Calendar dayOfBirth, String general, String cmndNumber, String numberCall, String email) {
        this.fullName = fullName;
        this.dayOfBirth = dayOfBirth;
        this.general = general;
        this.cmndNumber = cmndNumber;
        this.numberCall = numberCall;
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    //    public String getDayOfBirth() {
//        return dayOfBirth;
//    }
//
//    public void setDayOfBirth(String dayOfBirth) {
//        this.dayOfBirth = dayOfBirth;
//    }
    public String getDateOfBirth() {
        return String.format("%d/%d/%d", dayOfBirth.get(Calendar.DATE), dayOfBirth.get(Calendar.MONTH) + 1, dayOfBirth.get(Calendar.YEAR));
    }
    public void setDateOfBirth(Calendar dateOfBirth) {
        this.dayOfBirth = dateOfBirth;
    }

    public Person() {
    }

    public String getGeneral() {
        return general;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
