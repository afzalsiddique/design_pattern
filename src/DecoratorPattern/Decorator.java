package DecoratorPattern;

abstract class Decorator implements Text {
    protected Text text;

    public Decorator(Text text) {
        this.text = text;
    }

    @Override
    public String getDescription() {
        return text.getDescription();
    }
}
