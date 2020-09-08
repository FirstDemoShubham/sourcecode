package practise2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapTraverse5Ways {
    public static void main(String[] args) {
        HashMap<Integer, String> courseMap = new HashMap<Integer, String>();
        courseMap.put(1, "English");
        courseMap.put(2, "Physics");
        courseMap.put(3, "Biology");
        courseMap.put(4, "History");
        courseMap.put(5, "Mathematics");

        // 1 . Iterate Hashmap EntrySet using Iterator
        //methodOne(courseMap);

        // 2 . Iterate through HashMap keySet using Iterator
        //methodTwo(courseMap);

        // 3 . Iterate hashmap using lambda expression
        //methodThree(courseMap);

        // 4 . Iterate Hashmap using Stream API
        methodFour(courseMap);
    }

    static void methodOne(HashMap<Integer, String> courseMap) {
        Iterator<Entry<Integer, String>> itr = courseMap.entrySet().iterator();
        while (itr.hasNext()) {
            Entry<Integer, String> entry = itr.next();
            System.out.println(entry.getKey() + " ~ " + entry.getValue());
        }
    }
    static void methodTwo (HashMap < Integer, String > courseMap){
        Iterator<Integer> itr= courseMap.keySet().iterator();
        while (itr.hasNext()){
            Integer key = itr.next();
            System.out.println(key+" : "+ courseMap.get(key));
        }
    }
    static void methodThree(HashMap < Integer, String > courseMap){
        courseMap.forEach((k,v) -> System.out.println(k+" = "+v));
    }
    static void methodFour(HashMap < Integer, String > courseMap){
        courseMap.entrySet().stream().forEach((entry) -> System.out.println(entry.getKey()+" - "+entry.getValue()));
    }

}
