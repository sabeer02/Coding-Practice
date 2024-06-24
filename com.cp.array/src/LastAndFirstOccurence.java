import java.util.Arrays;

public class LastAndFirstOccurence {
    public static int[] lastAndFirstOccurence(int [] arr, int target){
        return new int[]{binarySearchFirst(arr,target),binarySearchLast(arr,target)};
    }
    public static int binarySearchLast(int [] arr,int target){
        int start=0;
        int end=arr.length-1;
        while (start<=end){
            int mid =start + (end-start)/2;
            if(arr[start]<=target)start=mid+1;
            else end=mid-1;
        }
        return start;
    }
    public static int binarySearchFirst(int [] arr, int target){
        int start=0;
        int end=arr.length-1;
        while (start<end){
            int mid =start + (end-start)/2;
            if(arr[start]<=target)start=mid+1;
            else end=mid-1;
        }
        return end;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,5,5,6,7,8};
        int [] res = lastAndFirstOccurence(arr,5);
        System.out.println(Arrays.toString(res));
    }
}
