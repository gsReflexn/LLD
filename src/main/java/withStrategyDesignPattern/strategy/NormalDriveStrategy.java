package withStrategyDesignPattern.strategy;

public class NormalDriveStrategy implements DriveStrategy {

    @Override
    public void drive() {
        System.out.println("This is Normal Drive Strategy implementation");
    }
}
