package DecoratorPattern;

public class Main {
    public static void main(String[] args) {
        Text text = new Encrypt2(new Encrypt1(new PlainText("abcd")));
        String res= text.getDescription();
        System.out.println(res);

        Text text2 = new Decrypt1(new Decrypt2(new PlainText("defg")));
        String res2= text2.getDescription();
        System.out.println(res2);
    }
}
