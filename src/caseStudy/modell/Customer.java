package caseStudy.modell;

import java.time.LocalDate;
import java.util.Calendar;

public class Customer extends Person {
    int serial;
    String idCustomer;
    String typeCustomer;
    String location;
    public Customer(int serial,String fullName, Calendar dayOfBirth, String general, String cmndNumber, String numberCall, String email, String idCustomer,
                    String typeCustomer, String location) {
        super(fullName,dayOfBirth,general,cmndNumber,numberCall,email);
        this.serial=serial;
        this.idCustomer = idCustomer;
        this.typeCustomer = typeCustomer;
        this.location = location;
    }
    public Customer() {
    }
    public String getIdCustomer() {
        return idCustomer;
    }

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }
    public String getTypeCustomer() {
        return typeCustomer;
    }
    public void setTypeCustomer(String typeCustomer) {
        this.typeCustomer = typeCustomer;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "serial=" + serial +
                "idCustomer=" + idCustomer +
                ", typeCustomer='" + typeCustomer + '\'' +
                ", location='" + location + '\'' +
                ", fullName='" + fullName + '\'' +
                ", dayOfBirth=" + String.format("%d/%d/%d", dayOfBirth.get(Calendar.DATE), dayOfBirth.get(Calendar.MONTH) + 1, dayOfBirth.get(Calendar.YEAR))+
                ", general='" + general + '\'' +
                ", cmndNumber='" + cmndNumber + '\'' +
                ", email='" + email + '\'' +
                ", numberCall='" + numberCall + '\'' +
                '}';
    }
    public String getInforCSV()
    {
        return serial+","+fullName+","+String.format("%d/%d/%d", dayOfBirth.get(Calendar.DATE), dayOfBirth.get(Calendar.MONTH) + 1, dayOfBirth.get(Calendar.YEAR))+","+general+","+cmndNumber+","+numberCall+","+email+","+idCustomer+","+typeCustomer+","+location;
    }
}
