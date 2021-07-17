package DecoratorPatternPizza;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new Cheese(new Mozzarella(new PlainPizza()));
        System.out.println(pizza.getDescription());
        System.out.println(pizza.getPrice());
    }
}
