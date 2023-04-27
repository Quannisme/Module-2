package caseStudy.modell;

public class Villa extends Facility {
     String roomStandard;
     double poolArea;
     int floorNumber;
    public Villa(String serviceName, double useArea, double costRental, int numberMaximum, String typeRent,
            String roomStandard, double poolArea, int floorNumber) {
        super(serviceName, useArea, costRental, numberMaximum, typeRent);
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.floorNumber = floorNumber;
    }
    public Villa(String roomStandard, double poolArea, int floorNumber) {
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.floorNumber = floorNumber;
    }
    public String getRoomStandard() {
        return roomStandard;
    }
    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }
    public double getPoolArea() {
        return poolArea;
    }
    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }
    public int getFloorNumber() {
        return floorNumber;
    }
    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }
    @Override
    public String toString() {
        return "Villa [roomStandard=" + roomStandard + ", poolArea=" + poolArea + ", floorNumber=" + floorNumber + "]";
    }
     

}
