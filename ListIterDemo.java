package practise2;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIterDemo {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add("ABCD");
        al.add("HHGH");
        al.add("BBS");
        al.add("hello");
        al.add("cello");
        al.add("Natraj");
        System.out.println(al);
        ListIterator itr = al.listIterator();
        while(itr.hasNext()){
            String s = (String) itr.next();
            if(s.equals("HHGH")){
                itr.remove();
            }else if(s.equals("cello")){
                itr.add("cello_2");
            }else if(s.equals("Natraj")){
                itr.set("Pencils");
            }
        }
        System.out.println(al);

    }
}
