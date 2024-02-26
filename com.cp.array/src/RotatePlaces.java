import java.util.Arrays;

public class RotatePlaces {
    static void rotatePlace(int[] arr, int places){
        if(arr.length <= 1 || places==arr.length){
            return;
        }
        reverseArray(arr,0,places-1);
        reverseArray(arr,places, arr.length-1);
        reverseArray(arr,0, arr.length-1);
    }
    static void reverseArray(int [] arr, int start, int end){
        while(start<=end){
            int temp = arr[start];
            arr[start++] = arr[end];
            arr[end--] = temp;
        }
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7};
        rotatePlace(arr,2);
        System.out.println(Arrays.toString(arr));
        System.out.println("[3, 4, 5, 6, 7, 1, 2]");
    }
}
