package DecoratorPattern;

public class Encrypt1 extends Decorator {
    public Encrypt1(Text pizza) {
        super(pizza);
        System.out.println("Encryption1");
    }
    @Override
    public String getDescription() {
        String a = pizza.getDescription();
        char[] arr = a.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            arr[i] += 1;
        }
        return new String(arr);
    }
}