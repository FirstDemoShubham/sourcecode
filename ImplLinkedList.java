package practise2;

import java.util.LinkedList;

public class ImplLinkedList {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.add("durga");
        l.add(30);
        l.add(null);
        l.add("durga");
        l.set(0,"software");
        l.add(0,"venky");
        l.addFirst("ccc");
        System.out.println(l);

    }
}
