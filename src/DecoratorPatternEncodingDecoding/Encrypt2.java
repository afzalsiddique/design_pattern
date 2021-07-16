package DecoratorPatternEncodingDecoding;

public class Encrypt2 extends EncryptDecorator {
    public Encrypt2(PlainText text) {
        super(text);
    }
    @Override
    public String getText() {
        String a= plainText.getText();
        char[] arr = a.toCharArray();
        for(int i=0; i<arr.length;i++){
            arr[i]+=1;
        }
        return new String(arr);
    }
}
