package practise2;

import java.util.ArrayList;
import java.util.Iterator;

public class ImplArrayList {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();

        al.add("Hello");
        al.add(12);
        al.add(null);
        al.add(73635.45);
        al.add('A');
        System.out.println(al);
        al.remove(2);

/*        Iterator itr = al.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }*/
        al.forEach(records -> System.out.println(records));

    }
}
