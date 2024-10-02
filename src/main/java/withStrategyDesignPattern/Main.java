package withStrategyDesignPattern;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new NormalVehicle();
        vehicle.drive();
    }

    //Say now if i want to add one more type of drive then
    //i will have to do just two things. 1. Define the strategy for it by extending the DriverStrategy
    //2. Define the class for it extending the Vehicle class and do a constructor injection for strategy.
    //By doing we have not changed the main method code(or didn't touched the main method's code)
    



}
