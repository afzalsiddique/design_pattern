package DecoratorPattern;

abstract class DecodingDecorator implements Text {
    protected Text pizza;

    public DecodingDecorator(Text pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription();
    }
}
