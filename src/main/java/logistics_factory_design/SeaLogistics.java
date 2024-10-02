package logistics_factory_design;
public class SeaLogistics implements Logistics {
    @Override
    public void transport() {
        System.out.println("Transporting goods by sea...");
    }
}
