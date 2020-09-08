package practise2;
//using temp array
public class RemoveArrayDuplicates {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,4,4,5,5,6};
        int[] uniqArr = new int[arr.length];

        System.out.println("Original array: ");

        for (int c = 0; c < arr.length; c++) {
            System.out.print(arr[c]+" ");
        }

        int j = 0;

        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] != arr[i + 1]) {
                uniqArr[j] = arr[i];
                j++;
            }
        }
        uniqArr[j] = arr[arr.length-1];
        System.out.println("\nDuplicates are removed: ");
        for (int c = 0; c < arr.length; c++) {
            System.out.print(uniqArr[c]+" ");
        }
    }
}
