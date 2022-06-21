package OOP_part1.Task5;

public class TestPizzaOrder {
    public static void main(String[] args) {
        PizzaOrder pizzaOrder = new PizzaOrder("Аль-Капчоне", "Small", false, "Ленинградская 75");
        pizzaOrder.cancel();
        pizzaOrder.order();
        pizzaOrder.cancel();

        System.out.println(pizzaOrder);

        pizzaOrder.setAdress("Ленинградская 15");
        pizzaOrder.setSauce(true);
        pizzaOrder.setSize("Big");
        pizzaOrder.setTitle("Чикибамбони");
        
        System.out.println(pizzaOrder.getAdress());
        System.out.println(pizzaOrder.getTitle());
        System.out.println(pizzaOrder.getSize());
        System.out.println(pizzaOrder.isSauce());
        System.out.println(pizzaOrder);
    }
}
