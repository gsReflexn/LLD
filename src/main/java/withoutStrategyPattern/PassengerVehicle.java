package withoutStrategyPattern;

public class PassengerVehicle extends Vehicle{
    @Override
    public void drive() {
        System.out.println("Passenger Vehicle Drive Capability");
    }
}
