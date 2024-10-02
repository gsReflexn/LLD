package withStrategyDesignPattern;

import withStrategyDesignPattern.strategy.DriveStrategy;
import withStrategyDesignPattern.strategy.NormalDriveStrategy;

public class GoodsVehicle extends Vehicle{

    public GoodsVehicle(DriveStrategy driveStrategy) {
        super(new NormalDriveStrategy());
    }
}
