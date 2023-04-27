package caseStudy.modell;

public class House extends Facility {
    String roomStandard;
    int floorNumber;
    public House(String serviceName, double useArea, double costRental, int numberMaximum, String typeRent,
            String roomStandard, int floorNumber) {
        super(serviceName, useArea, costRental, numberMaximum, typeRent);
        this.roomStandard = roomStandard;
        this.floorNumber = floorNumber;
    }
    public String getRoomStandard() {
        return roomStandard;
    }
    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }
    public int getFloorNumber() {
        return floorNumber;
    }
    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }
    @Override
    public String toString() {
        return "House [roomStandard=" + roomStandard + ", floorNumber=" + floorNumber + "]";
    }
    
}
