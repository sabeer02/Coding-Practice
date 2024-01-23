public class BinarySearchRotatedSortedArray {
    static public int peakIndexRotatedArray(int[] arr,int target){
        int len = arr.length-1;
        int start=0;
        int end=len;

        while (start<end){
            int mid = start + (end-start)/2;

            if(arr[mid+1]<arr[mid]){
                end=mid;
            }else{
                start=mid+1;
            }
        }

        int peakIndex=start;

        if(arr[len]<=target){
            return arr[applyBinarySrch(arr,peakIndex+1,len,target)];
        }else {
            return arr[applyBinarySrch(arr,0,peakIndex,target)];
        }
    }

    static public int applyBinarySrch(int[] arr,int start,int end,int target){
        while (start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]>target){
                end=mid-1;
            }else if(arr[mid]<target){
                start=mid+1;
            }else {
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int res = peakIndexRotatedArray(arr,6);
        System.out.println(res);
    }
}
