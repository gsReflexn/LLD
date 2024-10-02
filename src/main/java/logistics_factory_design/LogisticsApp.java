package logistics_factory_design;

public class LogisticsApp {
    public static void main(String[] args) {
        Logistics roadLogistics = LogisticsFactory.createLogistics("road");
        roadLogistics.transport();

        Logistics seaLogistics = LogisticsFactory.createLogistics("sea");
        seaLogistics.transport();
    }
}
