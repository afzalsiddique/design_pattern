package DecoratorPattern;

abstract class DecodingDecorator implements Text {
    protected Text text;

    public DecodingDecorator(Text text) {
        this.text = text;
    }

    @Override
    public String getDescription() {
        return text.getDescription();
    }
}
