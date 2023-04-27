package caseStudy.modell;

public class Room extends Facility {
    String freeSirviceInclude;

    public String getFreeSirviceInclude() {
        return freeSirviceInclude;
    }

    public void setFreeSirviceInclude(String freeSirviceInclude) {
        this.freeSirviceInclude = freeSirviceInclude;
    }

    public Room(String serviceName, double useArea, double costRental, int numberMaximum, String typeRent,
            String freeSirviceInclude) {
        super(serviceName, useArea, costRental, numberMaximum, typeRent);
        this.freeSirviceInclude = freeSirviceInclude;
    }

    public Room() {
    }

    @Override
    public String toString() {
        return "Room [freeSirviceInclude=" + freeSirviceInclude + "]";
    }
    
}
