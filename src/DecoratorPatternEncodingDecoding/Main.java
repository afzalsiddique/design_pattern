//package DecoratorPatternEncodingDecoding;
//
//public class Main {
//    public static void main(String[] args) {
//        String given_text="aaabbcc";
//        System.out.println("Given text: "+given_text);
//        Text text = new Compressor(new Encrypt2(new Encrypt1(new MyString(given_text))));
//        String res= text.getText();
//        System.out.println("After encrypting and compressing: "+res);
//        Text text2 = new Decrypt1(new Decrypt2(new Decompressor(new MyString(res))));
//        String res2= text2.getText();
//        System.out.println("After decrypting and decompressing: "+res2);
//    }
//}
