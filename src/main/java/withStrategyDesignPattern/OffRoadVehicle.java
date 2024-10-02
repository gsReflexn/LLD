package withStrategyDesignPattern;

import withStrategyDesignPattern.strategy.SportsDriveStrategy;

public class OffRoadVehicle extends Vehicle{
    public OffRoadVehicle() {
        super(new SportsDriveStrategy());
    }
}
