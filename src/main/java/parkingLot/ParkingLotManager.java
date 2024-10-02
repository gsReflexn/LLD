package parkingLot;

import java.util.List;

abstract public class ParkingLotManager {
  List<ParkingSpot> parkingSpotList;
  public ParkingLotManager(List<ParkingSpot> spots){
      this.parkingSpotList = spots;
  }
  //method to get Parking spot. it is abstract and it will be overridden differently
  //for two wheeler and four wheeler.
    abstract ParkingSpot findParkingSlot();

   public  void parkVehicle(Vehicle vehicle){
       findParkingSlot();
   }
   public  void removeVehicle(Vehicle vehicle){
       //logic to remove parked vehicle;
       for (ParkingSpot spot : parkingSpotList) {
           if (spot.vehicle != null && spot.vehicle.equals(vehicle)) {
               spot.removeVehicle();
               break;
           }
       }
   }




}
