import java.util.Arrays;
import java.util.Random;

public class QuickSort {
    public static void quickSort(int [] arr, int start, int end){
        if(start>=end)return;

        Random random = new Random();
        int pivot = arr[random.nextInt(arr.length-1)];
        int left=start;
        int right=end;

        //organise it
        while (left<=right){
            while(arr[left]<pivot){
                left++;
            }
            while (arr[right]>pivot) {
                right--;
            }
            if(left<=right){
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
            }
        }

        // recursive call
        quickSort(arr,start,right);
        quickSort(arr,left,end);
    }

    public static void main(String[] args) {
        int [] arr = {6,5,3,8,1,9,2};
        quickSort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
