public class InsertionSort {
    public static int [] insertionSort(int [] arr){
        for(int i=0;i< arr.length-1;i++){
            int j=i+1;
            while (j>0 && arr[j]<arr[j-1]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int [] arr = {4,3,5,6,9,0,1};
        int [] res = insertionSort(arr);
        for (int i : res) {
            System.out.print(i + " ");
        }
    }
}
