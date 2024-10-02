package parkingLot;

import java.util.ArrayList;

public class ExitGate {
    ParkingSpotManagerFactory factory;

    ExitGate(ParkingSpotManagerFactory factory) {
        this.factory = factory;
    }

    void removeVehicle(Ticket ticket) {
        ParkingLotManager manager = factory.getParkingLotManger(ticket.vehicle.vehicleType, new ArrayList<>());
        manager.removeVehicle(ticket.vehicle);
    }
}
