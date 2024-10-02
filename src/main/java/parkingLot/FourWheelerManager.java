package parkingLot;

import java.util.List;

public class FourWheelerManager extends ParkingLotManager{

    public FourWheelerManager(List<ParkingSpot> spots) {
        super(spots);
    }

    @Override
    ParkingSpot findParkingSlot() {

        //logic to find the nearest parking slot for four wheeler.
        //A min heap can be implemented for vacant slots based on the distance from the gate.
        return null;
    }
}
