package parkingLot;

import java.util.Vector;

public class ParkingSpot {
   int id;
   Vehicle vehicle;

   boolean isEmpty;

   int price;


    private double distanceFromEntrance;  // Add this attribute

    public ParkingSpot(int id, int price,int distanceFromEntrance) {
        this.id = id;
        this.isEmpty = true;
        this.price = price; // default price when a parking gets added.
        this.distanceFromEntrance = distanceFromEntrance;
    }

    void parkVehicle(Vehicle v) {
        this.vehicle = v;
        this.isEmpty = false;
    }

    void removeVehicle() {
        this.vehicle = null;
        this.isEmpty = true;
    }

    double getDistanceFromEntrance(){
        return distanceFromEntrance;
    }
    boolean getIsEmpty(){
        return isEmpty;
    }
}
