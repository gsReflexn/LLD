package withStrategyDesignPattern;

import withStrategyDesignPattern.strategy.DriveStrategy;

public class Vehicle {
    DriveStrategy driveStrategy;  //interface's reference
    public Vehicle(DriveStrategy driveStrategy){
        this.driveStrategy = driveStrategy;
    }
    public void drive(){
        driveStrategy.drive();
    }
}
