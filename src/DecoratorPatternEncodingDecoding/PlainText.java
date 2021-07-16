package DecoratorPatternEncodingDecoding;

public class PlainText implements InterfaceText{
    String text;
    public void setText(String text){
        this.text=text;
    }
    @Override
    public String getText() {
        return text;
    }
}
