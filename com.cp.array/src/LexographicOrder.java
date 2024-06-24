import java.util.Arrays;

public class LexographicOrder {

    static int[] lexographicOrder(int [] arr, int n){
        int BigI = 0;
        int BigJ = 0;

        // Find the largest number [i] < [i+1]  -> BigI
        for (int i = 0; i < n-1; i++) {
            if(arr[i]<arr[i+1]){
                BigI=arr[i];
            }
        }

        // Find the largest number after BigI   -> BigJ
        for (int i = BigI; i < n; i++) {
            if (arr[BigI]<arr[i]){
                BigJ=arr[i];
            }
        }

        // Swap them
        int temp = arr[BigI];
        arr[BigI] = arr[BigJ];
        arr[BigJ] = temp;
        System.out.println(Arrays.toString(arr));
        // Reverse BigI to N
        reverseArray(arr,0,n-1);
        return arr;
    }

    static void reverseArray(int [] arr, int start, int end){
        while (start<=end ){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            end--;
            start++;
        }

    }
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(Arrays.toString(arr));
        int n = arr.length;
        arr = lexographicOrder(arr,n);
        System.out.println(Arrays.toString(arr));
    }
}
