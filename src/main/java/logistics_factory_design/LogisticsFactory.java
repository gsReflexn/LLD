package logistics_factory_design;
public class LogisticsFactory {
    public static Logistics createLogistics(String type) {
        if (type.equalsIgnoreCase("road")) {
            return new RoadLogistics();
        } else if (type.equalsIgnoreCase("sea")) {
            return new SeaLogistics();
        }
        throw new IllegalArgumentException("Invalid logistics type");
    }
}
