package DecoratorPattern;

public class Compressor extends Decorator {
    public Compressor(Text text) {
        super(text);
        System.out.println("Compressor");
    }
    @Override
    public String getText() {
        String str = text.getText();
        char[] arr = str.toCharArray();
        int n=arr.length;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            int cnt=1;
            while(i+1<n && arr[i]==arr[i+1]){
                cnt++;
                i+=1;
            }
//            System.out.println(arr[i]);
//            System.out.println(cnt);
            sb.append(arr[i]);
            sb.append(cnt);
        }
        //        System.out.println(sb.toString());
        return sb.toString();
    }
}
