package caseStudy.modell;

public abstract class Facility {
    String serviceName;
    double useArea;
    double costRental;
    int numberMaximum;
    String typeRent;
    
    Facility() {
    }

    Facility(String serviceName, double useArea, double costRental, int numberMaximum, String typeRent) {
        this.serviceName = serviceName;
        this.useArea = useArea;
        this.costRental = costRental;
        this.numberMaximum = numberMaximum;
        this.typeRent = typeRent;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getUseArea() {
        return useArea;
    }

    public void setUseArea(double useArea) {
        this.useArea = useArea;
    }

    public double getCostRental() {
        return costRental;
    }

    public void setCostRental(double costRental) {
        this.costRental = costRental;
    }

    public int getNumberMaximum() {
        return numberMaximum;
    }

    public void setNumberMaximum(int numberMaximum) {
        this.numberMaximum = numberMaximum;
    }

    public String getTypeRent() {
        return typeRent;
    }

    public void setTypeRent(String typeRent) {
        this.typeRent = typeRent;
    }

    @Override
    public String toString() {
        return "Facility [serviceName=" + serviceName + ", useArea=" + useArea + ", costRental=" + costRental
                + ", numberMaximum=" + numberMaximum + ", typeRent=" + typeRent + "]";
    }
    
}
