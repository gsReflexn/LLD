package withStrategyDesignPattern;

import withStrategyDesignPattern.strategy.DriveStrategy;
import withStrategyDesignPattern.strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle{

    public SportsVehicle() {
        super(new SportsDriveStrategy());
    }

}
