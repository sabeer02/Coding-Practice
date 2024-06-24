public class PeakIndexPractice {
    public static int findInMountainArray(int target, int [] arr) {
        int peak = findPeak(arr);
        //first range
        int res = bs(arr,target,0,peak,true);
        if(res != -1){
            return res;
        }
        return bs(arr,target,peak+1,arr.length-1,false);
    }

    public static int findPeak(int[] arr){
        int start=0;
        int end=arr.length-1;
        while (start<end){
            int mid = start + (end-start)/2;
            if (arr[mid]<arr[mid+1])start=mid+1;
            else end=mid;
        }
        return start;
    }

    public static int bs(int [] arr, int target,int start, int end, boolean isAsc){
        while(start<=end){
            int mid = (start + (end-start)/2);
            if(arr[mid] == target) return mid;
            else if(arr[mid]>target){
                if(isAsc){
                    end=mid-1;
                }else {
                    start=mid+1;
                }
            }
            else if(arr[mid]<target){
                if(isAsc) {
                    start = mid + 1;
                }else {
                    end=mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String [] args){
        int [] arr={1,2,4,5,3,2,1};
        int target = 3;
        int res = findInMountainArray(target,arr);
        System.out.println(res);
    }
}
