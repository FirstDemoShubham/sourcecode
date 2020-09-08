package practise2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DuplicateCharString {
    public static void main(String[] args) {
        String str = "hellosirrr";
        char[] ch = str.toCharArray();
        HashMap<Character, Integer> hm = new HashMap<>();
        for (char c : ch) {
            if (hm.get(c) != null) {
                hm.put(c, hm.get(c) + 1);
            } else {
                hm.put(c, 1);
            }
        }
        Iterator<Map.Entry<Character, Integer>> itr = hm.entrySet().iterator();
        while ((itr.hasNext())) {
            Map.Entry<Character, Integer> entry = itr.next();
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
    }
}
