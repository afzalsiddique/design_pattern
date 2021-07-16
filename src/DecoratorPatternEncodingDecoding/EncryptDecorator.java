package DecoratorPatternEncodingDecoding;

abstract class EncryptDecorator implements InterfaceText{
    PlainText plainText;
    public EncryptDecorator(PlainText text){
        plainText=text;
    }
    @Override
    public String getText() {
        return plainText.getText();
    }
}
