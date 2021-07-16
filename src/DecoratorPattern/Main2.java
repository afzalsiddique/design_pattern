//package DecoratorPattern;
//
//import java.util.ArrayList;
//
//public class Main2 {
//    public static void main(String[] args) {
//        String str = "aaebbbccd";
//        char[] arr = str.toCharArray();
//        int n=arr.length;
//        StringBuilder sb = new StringBuilder();
//        for(int i=0;i<n;i++){
//            int cnt=1;
//            while(i+1<n && arr[i]==arr[i+1]){
//                cnt++;
//                i+=1;
//            }
////            System.out.println(arr[i]);
////            System.out.println(cnt);
//            sb.append(arr[i]);
//            sb.append(cnt);
//        }
//        String myString = sb.toString();
//        System.out.println(myString);
//    }
//}
