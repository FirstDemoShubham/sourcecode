package practise2;

import javax.print.attribute.HashAttributeSet;
import java.util.HashMap;
import java.util.Iterator;

public class WordOccurrences {
    public static void main(String[] args) {
        String str = "I am am am a a coder";
        findDuplicateWords(str);
    }

    public static void findDuplicateWords(String str) {

        HashMap<String, Integer> hm = new HashMap<>();

        String strArr[] = str.split(" ");
        for (String s : strArr) {
            if (hm.get(s) != null) {
                hm.put(s, hm.get(s) + 1);
            } else {
                hm.put(s, 1);
            }
        }
        Iterator<String> itr = hm.keySet().iterator();
        while (itr.hasNext()) {
            String temp = itr.next();
            if(hm.get(temp) > 1){
                System.out.println("The word: "+temp+" appeared "+hm.get(temp)+ " -no of times");
            }
        }
        System.out.println(hm);

    }

}
