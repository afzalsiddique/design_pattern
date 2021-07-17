package DecoratorPatternEncodingDecoding;

public class Decrypt2 extends Decorator {
    public Decrypt2(Text text) {
        super(text);
        System.out.println("Decryption2");
    }
    @Override
    public String getText() {
        String a = text.getText();
        char[] arr = a.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            arr[i] -= 2;
        }
        return new String(arr);
    }
}
