package withStrategyDesignPattern;

import withStrategyDesignPattern.strategy.DriveStrategy;
import withStrategyDesignPattern.strategy.NormalDriveStrategy;

public class NormalVehicle extends Vehicle{

    public NormalVehicle() {
        super(new NormalDriveStrategy());
    }
}
