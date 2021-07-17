package DecoratorPatternEncodingDecoding;

public class MyString implements Text {
    String text;
    public MyString(String text){
        this.text=text;
    }
    @Override
    public String getText() {
        return text;
    }
}
