package DecoratorPattern;

public class PlainText implements Text {
    String text;
    public PlainText(String text){
        this.text=text;
    }
    @Override
    public String getDescription() {
        return text;
    }
}
