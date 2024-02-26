import java.util.Arrays;

public class RecursiveBubble {
    public static void main(String[] args) {
        int [] arr = {5,3,4,1,2};
        arr = bubbleSort(arr, arr.length, 0);
        System.out.println(Arrays.toString(arr));
    }
    static int[] bubbleSort (int [] arr,int row, int col){

        if(row==0){
            return arr;
        }

        if(row-1>col){
            if(arr[col+1] < arr[col]){
                int temp = arr[col];
                arr[col] = arr[col+1];
                arr[col+1]=temp;
            }
            return bubbleSort(arr,row,col+1);
        }

        return bubbleSort(arr, row-1, 0);
    }

}
