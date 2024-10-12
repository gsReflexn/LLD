package AbstractFactoryJava;

public class Client {
    public static void clientCode(FurnitureFactory factory) {
        Chair chair = factory.createChair();
        Sofa sofa = factory.createSofa();
        CoffeeTable coffeeTable = factory.createCoffeeTable();

        chair.sitOn();
        sofa.layOn();
        coffeeTable.placeItems();
    }

    public static void main(String[] args) {
        // Creating Victorian furniture
        FurnitureFactory victorianFactory = new VictorianFurnitureFactory();
        System.out.println("Victorian Furniture Set:");
        clientCode(victorianFactory);

        System.out.println();

        // Creating Modern furniture
        FurnitureFactory modernFactory = new ModernFurnitureFactory();
        System.out.println("Modern Furniture Set:");
        clientCode(modernFactory);
    }
}
