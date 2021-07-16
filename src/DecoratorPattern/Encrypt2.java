package DecoratorPattern;

public class Encrypt2 extends Decorator {
    public Encrypt2(Text text) {
        super(text);
        System.out.println("Encryption2");
    }
    @Override
    public String getDescription() {
        String a = text.getDescription();
        char[] arr = a.toCharArray();
        for(int i=0; i<arr.length;i++){
            arr[i]+=2;
        }
        return new String(arr);
    }
}