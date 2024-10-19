package parkingLot;

import java.util.Comparator;
import java.util.List;

public class TwoWheelerManager extends  ParkingLotManager{


    public TwoWheelerManager(List<ParkingSpot> spots) {
        super(spots);
    }

    @Override
    ParkingSpot findParkingSlot() {
        //logic for finding the nearest parking slot for two wheeler
        parkingSpotList.sort(Comparator.comparingDouble(ParkingSpot::getDistanceFromEntrance));
        // Find the first available parking spot (closest to the entrance)
        for (ParkingSpot spot : parkingSpotList) {
            if (spot.getIsEmpty()) {
                return spot;
            }
        }
        return null; // If no parking spot is available
    }


    //There can be multiple entrance gates. In that case we can create a
    //Map of<gatId, distanceFromGate,ParkingSpotId> and then sort it accordingly to get the desired output.

}
