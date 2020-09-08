package practise2;
//without using temp array

public class RemoveArrayDuplicates2 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,4,4,5,5,6};

        int j = 0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i] != arr[i+1]){
                arr[j] = arr[i];
                j++;
            }
        }
        arr[j] = arr[arr.length-1];

        for(int c=0;c<=j;c++){
            System.out.print(arr[c]+" ");
        }

    }
}
