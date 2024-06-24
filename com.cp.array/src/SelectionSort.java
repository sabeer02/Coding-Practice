public class SelectionSort {
    public static int findMin(int [] arr, int start, int end){
        int min=start;
        for(int i=start;i<end;i++){
            if(arr[i]<arr[min]){
                min=i;
            }
        }
        return min;
    }
    public static int findMax(int [] arr, int start, int end){
        int max=start;
        for(int i=start;i<end;i++){
            if(arr[i]>arr[max]){
                max=i;
            }
        }
        return max;
    }
    public static int [] selectionSort_min(int [] arr){

        for (int i = 0; i < arr.length-1; i++) {
            int min_index=findMin(arr,i+1, arr.length);
            if(arr[i]>arr[min_index]){
                int temp=arr[i];
                arr[i]=arr[min_index];
                arr[min_index]=temp;
            }
        }
        return arr;
    }

    public static int [] selectionSort_max(int [] arr){

        for (int i = arr.length-1; i > 0; i--) {
            int max_index=findMax(arr,0, i-1);
            if(arr[i]<arr[max_index]){
                int temp=arr[i];
                arr[i]=arr[max_index];
                arr[max_index]=temp;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int [] arr = {4,5,3,7,9};

        int [] res_min = selectionSort_min(arr);
        for (int num:res_min){
            System.out.print(num +" ");
        }

        System.out.println();

        int [] res_max = selectionSort_min(arr);
        for (int num:res_max){
            System.out.print(num +" ");
        }
    }
}
