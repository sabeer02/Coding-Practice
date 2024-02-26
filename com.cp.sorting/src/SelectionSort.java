public class SelectionSort {
    static int findMax(int[] arr, int end){
        int greatestIndex = end;
        for (int i = 0; i < end; i++) {
            if(arr[i] > arr[greatestIndex]){
                greatestIndex = i;
            }else {
                break;
            }
        }
        return greatestIndex;
    }

    static int[] selectionSort(int[] arr){
        for (int i = arr.length-1; i > 0 ; i--) {
            int greatest = findMax(arr,i);
            if (arr[i] < arr[greatest]){
                int temp = arr[i];
                arr[i] = arr[greatest];
                arr[greatest]=temp;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int [] arr = {5,3,4,1,2};
        int [] res = selectionSort(arr);
        for (int ele:
             res) {
            System.out.print(ele + " ");
        }
    }
}
