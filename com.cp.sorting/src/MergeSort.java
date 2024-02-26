import java.util.*;

public class MergeSort {
    public static void main(String[] args) {
        int [] arr = {5,4,3,2,1};
        arr = mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static int[] mergeSort(int [] arr){
        if(arr.length == 1 ){
            return arr;
        }
        int mid = arr.length/2;

        int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);
    }
    static int[] merge (int [] left, int [] right){
        int[] merge = new int[left.length + right.length];

        int left_ptr = 0, right_ptr = 0;
        int merge_ptr=0;

        while (left_ptr < left.length && right_ptr<right.length){
            if(left[left_ptr]<right[right_ptr]){
                merge[merge_ptr] = left[left_ptr];
                left_ptr++;
            }else {
                merge[merge_ptr] = right[right_ptr];
                right_ptr++;
            }
            merge_ptr++;
        }
        while (left_ptr<left.length){
            merge[merge_ptr++]=left[left_ptr++];
        }
        while (right_ptr<right.length){
            merge[merge_ptr++]=right[right_ptr++];
        }
        return merge;
    }
}
