package practise2;
// To find the first non repeated character in the String

public class NonRepeatedChar {
    public static void main(String[] args) {
        String str = "aaaabsmfabfkad";
        for (int i=0;i<str.length();i++){
            char compare = str.charAt(i);
            for (int j =i+1;j<str.length();j++){
                if(compare == str.charAt(j))
                    break;
            }
        }
    }
}
