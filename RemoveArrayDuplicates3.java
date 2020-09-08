package practise2;

import java.util.HashSet;

public class RemoveArrayDuplicates3 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 4, 4, 5, 5, 6};

        HashSet<Integer> hs = new HashSet();
        for (int i = 0; i < arr.length; i++) {
            hs.add(arr[i]);
        }
        for (Integer i : hs) {
            System.out.print(i+" ");
        }
    }
}
