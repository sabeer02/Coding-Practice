import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int [] arr = {5,3,4,1,2};
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j > 0 ; j--) {
                if(arr[j-1] > arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }else {
                    break;
                }
            }
        }
        for (int ele:
             arr) {
            System.out.print(ele + " ");
        }
    }
}
