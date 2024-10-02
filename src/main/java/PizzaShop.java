import decorator.*;

public class PizzaShop {
    public static void main(String[] args) {
        //Extra cheese Margherita pizza
        BasePizza basePizza = new ExtraCheese(new Margherita());
        System.out.println("Price for extra cheese Margherita pizza is "+ basePizza.cost());

        //Extra Mushroom to Farmhouse pizza

        BasePizza basePizza1 = new Mushroom(new Farmhouse());
        System.out.println("Price for extra mushroom Farmhouse pizza is "+ basePizza1.cost());

    }
}
