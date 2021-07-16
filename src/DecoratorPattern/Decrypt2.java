package DecoratorPattern;

public class Decrypt2 extends DecodingDecorator {
    public Decrypt2(Text text) {
        super(text);
        System.out.println("Decryption2");
    }
    @Override
    public String getDescription() {
        String a = text.getDescription();
        char[] arr = a.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            arr[i] -= 2;
        }
        return new String(arr);
    }
}
