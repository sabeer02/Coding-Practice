import java.util.*;
public class RotateOnePlace {
    static void rotateOnePlace(int[] arr){
        if(arr.length <= 1){
            return;
        }
        reverseArray(arr,0, arr.length-1);
        reverseArray(arr,0, arr.length-2);
    }
    static void reverseArray(int [] arr, int start, int end){
        while(start<=end){
            int temp = arr[start];
            arr[start++] = arr[end];
            arr[end--] = temp;
        }
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        rotateOnePlace(arr);
        System.out.println(Arrays.toString(arr));
    }
}
