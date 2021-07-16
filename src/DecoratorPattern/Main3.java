package DecoratorPattern;

public class Main3 {
    public static void main(String[] args) {
        StringBuilder a = new StringBuilder();
        a.append('a');
        a.append(1);
        String str = a.toString();
        System.out.println(str);
    }
}
