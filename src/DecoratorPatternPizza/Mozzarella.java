package DecoratorPatternPizza;

public class Mozzarella extends ToppingDecorator{
    public Mozzarella(Pizza pizza) {
        super(pizza);
        System.out.println("adding mozzarella");
    }
    @Override
    public String getDescription() {
        return pizza.getDescription() + " mozzarella";
    }
    @Override
    public double getPrice() {
        return pizza.getPrice() + 0.50;
    }
}
