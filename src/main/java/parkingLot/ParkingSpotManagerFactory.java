package parkingLot;

import java.util.List;

public class ParkingSpotManagerFactory {
    public ParkingLotManager getParkingLotManger(VehicleType vehicle, List<ParkingSpot> parkingSpotList){
        //Suppose a new vehicle came. Now you have list fo parkingSpots for either two wheeler or four wheeler.
        //You will have to return the Object of ParkingLotManager based on the input.

        if (vehicle == VehicleType.TwoWheeler)
            return new TwoWheelerManager(parkingSpotList);
        else if (vehicle == VehicleType.FourWheeler)
            return new FourWheelerManager(parkingSpotList);
        else
            return null; // Handle error
    }
}
