package caseStudy.modell;

import java.time.LocalDate;

public class Customer extends Person {
    int idCustomer;
    String typeCustomer;
    String location;
    public Customer(String fullName, LocalDate dayOfBirth, String general, String cmndNumber, int numberCall, int idCustomer,
            String typeCustomer, String location) {
        super(fullName, dayOfBirth, general, cmndNumber, numberCall);
        this.idCustomer = idCustomer;
        this.typeCustomer = typeCustomer;
        this.location = location;
    }
    public Customer() {
    }
    public int getIdCustomer() {
        return idCustomer;
    }
    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }
    @Override
    public String toString() {
        return "Customer [idCustomer=" + idCustomer + ", typeCustomer=" + typeCustomer + ", location=" + location + "]";
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
    
}
