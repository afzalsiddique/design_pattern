package DecoratorPattern;

public class Decrypt1 extends Decorator {
    public Decrypt1(Text pizza) {
        super(pizza);
        System.out.println("Decryption1");
    }
    @Override
    public String getDescription() {
        String a = pizza.getDescription();
        char[] arr = a.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            arr[i] -= 1;
        }
        return new String(arr);
    }
}
