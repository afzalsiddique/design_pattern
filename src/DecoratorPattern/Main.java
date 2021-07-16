package DecoratorPattern;

public class Main {
    public static void main(String[] args) {
        Text pizza = new Encrypt2(new Encrypt1(new PlainText("abcd")));
        String res= pizza.getDescription();
        System.out.println(res);
        Text pizza2 = new Decrypt1(new Decrypt2(new PlainText("defg")));
        String res2= pizza2.getDescription();
        System.out.println(res2);
    }
}
