package practise2;

public class StringReverse {
    public static void main(String[] args) {
        String str= new String("Shubham");
        String temp = "";
        int limit = str.length() -1;
        for(int i=limit;i>=0;i--){
            temp = temp + str.charAt(i);
        }
        System.out.println("Reversed string: "+temp);
    }
}
