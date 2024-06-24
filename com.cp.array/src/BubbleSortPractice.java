import java.util.Arrays;

public class BubbleSortPractice {
    private static int [] bubbleSort(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int [] arr = {9,8,7,6,5,3,2,1};
        int [] res = bubbleSort(arr);
        for (int i : res) {
            System.out.println(i);
        }

    }
}
