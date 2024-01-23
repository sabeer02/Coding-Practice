public class MergeSort {

    static public void binarySearch(int[] arr,int target){
        int strt = 0;
        int end = arr.length-1;
        int indexFound =-1;

        while (strt<=end){
            int mid = strt + (end-strt)/2;
            if(arr[mid]<=target){
                strt=mid+1;
            } else{
                end=mid-1;
            }
            if(arr[mid]==target){
                indexFound=mid;
            }
        }
        System.out.println(indexFound);

    }
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,40,50};
        int key = 40;
        binarySearch(arr,key);
    }
}
