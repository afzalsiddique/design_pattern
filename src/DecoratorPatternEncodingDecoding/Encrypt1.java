package DecoratorPatternEncodingDecoding;

public class Encrypt1 extends EncryptDecorator {
    public Encrypt1(PlainText text) {
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
