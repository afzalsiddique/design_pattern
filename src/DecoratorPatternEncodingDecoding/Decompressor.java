//package DecoratorPatternEncodingDecoding;
//
//public class Decompressor extends Decorator {
//    public Decompressor(Text text) {
//        super(text);
//        System.out.println("Decompressor");
//    }
//    @Override
//    public String getText() {
//        String str = text.getText();
//        char[] arr = str.toCharArray();
//        int n=arr.length;
//        StringBuilder sb = new StringBuilder();
//        for(int i=0;i<n;i+=2){
//            int cnt=arr[i+1]-48;
//            sb.append(String.valueOf(arr[i]).repeat(cnt));
//        }
////        System.out.println(sb.toString());
//        return sb.toString();
//    }
//}
