package DecoratorPattern;

public class Main {
    public static void main(String[] args) {
        Text text = new Compressor(new Encrypt2(new Encrypt1(new PlainText("aaabbcc"))));
        String res= text.getText();
        System.out.println(res);

        Text text2 = new Decrypt1(new Decrypt2(new Decompressor(new PlainText("d3e2f2"))));
        String res2= text2.getText();
        System.out.println(res2);
    }
}
