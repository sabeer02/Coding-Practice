import java.util.*;
public class RecursiveInsertion {
    public static void main(String[] args) {
        int [] arr = {5,3,4,1,2};
        int [] res = insertSort(arr,1,arr.length);
        System.out.println(Arrays.toString(res));
    }

    private static int[] insertSort(int[] arr, int ptr, int length) {
        if(ptr==length)return arr;
        int left_ptr =ptr;
        while (left_ptr>0 && arr[left_ptr-1] > arr[left_ptr]){
            int temp = arr[left_ptr-1];
            arr[left_ptr-1]=arr[left_ptr];
            arr[left_ptr]=temp;
            left_ptr--;
        }
        return insertSort(arr,ptr+1,length);
    }
}
