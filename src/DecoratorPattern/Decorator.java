package DecoratorPattern;

abstract class Decorator implements Text {
    protected Text pizza;

    public Decorator(Text pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription();
    }
}
