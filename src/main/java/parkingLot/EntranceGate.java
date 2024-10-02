package parkingLot;

import java.util.List;

public class EntranceGate {

    ParkingSpotManagerFactory factory;

    EntranceGate(ParkingSpotManagerFactory factory) {
        this.factory = factory;
    }

    ParkingSpot findParkingSpace(VehicleType vehicleType, List<ParkingSpot> spots) {
        ParkingLotManager manager = factory.getParkingLotManger(vehicleType, spots);
        return manager.findParkingSlot();
    }

    Ticket generateTicket(Vehicle vehicle, ParkingSpot parkingSpot) {
        // Implementation to generate ticket
        return null;
    }
}
