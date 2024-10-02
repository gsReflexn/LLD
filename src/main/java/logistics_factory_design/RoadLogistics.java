package logistics_factory_design;
public class RoadLogistics implements Logistics {
    @Override
    public void transport() {
        System.out.println("Transporting goods by road...");
    }
}
