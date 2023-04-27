package caseStudy.modell;

public class Booking {
    int idBooking;
    int starDate;
    int endDate;
    int idCustomer;
    String nameService;
    String typeService;
    public Booking() {
    }
    public Booking(int idBooking, int starDate, int endDate, int idCustomer, String nameService, String typeService) {
        this.idBooking = idBooking;
        this.starDate = starDate;
        this.endDate = endDate;
        this.idCustomer = idCustomer;
        this.nameService = nameService;
        this.typeService = typeService;
    }
    @Override
    public String toString() {
        return "Booking [idBooking=" + idBooking + ", starDate=" + starDate + ", endDate=" + endDate + ", idCustomer="
                + idCustomer + ", nameService=" + nameService + ", typeService=" + typeService + "]";
    }
    public int getIdBooking() {
        return idBooking;
    }
    public void setIdBooking(int idBooking) {
        this.idBooking = idBooking;
    }
    public int getStarDate() {
        return starDate;
    }
    public void setStarDate(int starDate) {
        this.starDate = starDate;
    }
    public int getEndDate() {
        return endDate;
    }
    public void setEndDate(int endDate) {
        this.endDate = endDate;
    }
    public int getIdCustomer() {
        return idCustomer;
    }
    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }
    public String getNameService() {
        return nameService;
    }
    public void setNameService(String nameService) {
        this.nameService = nameService;
    }
    public String getTypeService() {
        return typeService;
    }
    public void setTypeService(String typeService) {
        this.typeService = typeService;
    }
    
}
