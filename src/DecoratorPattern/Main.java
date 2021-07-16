package DecoratorPattern;

public class Main {
    public static void main(String[] args) {
        Text pizza = new Encrypt1(new Encrypt2(new PlainText("abcd")));
        System.out.println(pizza.getDescription());
    }
}
