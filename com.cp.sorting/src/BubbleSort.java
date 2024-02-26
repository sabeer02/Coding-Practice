public class BubbleSort {
    static int[] bubbleSort(int [] arr){
        for (int j = 0; j < arr.length-1; j++) {
            for (int i =0; i< arr.length-1;i++){
                if(arr[i]>arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }

        return arr;
    }
    public static void main(String[] args) {
        int [] arr = {5,3,4,1,2};
        int [] res = bubbleSort(arr);
        for (int ele:
             res) {
            System.out.print(ele + " ");
        }
    }
}
