package DecoratorPatternPizza;

public class PlainPizza implements Pizza{
    @Override
    public String getDescription() {
        return "thin dough";
    }
    @Override
    public double getPrice() {
        return 4.00;
    }
}
