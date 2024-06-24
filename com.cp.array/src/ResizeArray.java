import java.util.*;
public class ResizeArray {
    public static int [] resize(int [] arr, int capacity){
        int [] temp = new int[capacity];
        int temp_index=0;
        for (int i = 0; i < arr.length; i++) {
            temp[temp_index++]=arr[i];
        }
        arr=temp;
        return arr;
    }
    public static void main(String[] args) {
        int [] arr = {4,5,6,7};
        int capacity  = 4;
        capacity= arr.length+capacity;
        int [] res = resize(arr,capacity);
        System.out.println(Arrays.toString(res));
    }
}
