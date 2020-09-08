package practise2;

import java.util.HashMap;
import java.util.Map;

public class MapTraverse {
    public static void main(String[] args) {

        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1, "A");
        hm.put(2, "B");
        hm.put(3, "C");
        hm.put(4, "D");
        //iterateOne(hm);
        iterateTwo(hm);

    }
    static void iterateOne(HashMap<Integer,String> hm) {
        for (Map.Entry<Integer, String> entry : hm.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
    static void iterateTwo(HashMap<Integer,String> hm) {
        hm.forEach((k,v) -> System.out.println(k+" : "+v));
    }

}
