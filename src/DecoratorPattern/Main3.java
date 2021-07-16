package DecoratorPattern;

public class Main3 {
    public static void main(String[] args) {
        String str = "d3e2f2";
        char[] arr = str.toCharArray();
        int n=arr.length;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i+=2){
            int cnt=arr[i+1]-48;
            sb.append(String.valueOf(arr[i]).repeat(cnt));
        }
        System.out.println(sb.toString());
    }
}
