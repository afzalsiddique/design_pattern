package DecoratorPatternPizza;

public class Cheese extends ToppingDecorator{
    public Cheese(Pizza pizza) {
        super(pizza);
        System.out.println("adding cheese");
    }
    @Override
    public String getDescription() {
        return pizza.getDescription() + " cheese";
    }
    @Override
    public double getPrice() {
        return pizza.getPrice() + 0.30;
    }
}
