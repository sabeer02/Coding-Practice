public class PeakInMountain {
    public static int peakInMountain(int [] arr){
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int mid = start + (end-start)/2;
            if(mid<end && arr[mid+1]<arr[mid])return arr[mid];
            else if(mid>start && arr[mid-1]>arr[mid])return arr[mid-1];
            else if(arr[mid]>arr[start])start=mid;
            else end=mid-1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] arr = {4,5,6,7,8};
        int ele = peakInMountain(arr);
        System.out.println(ele);
    }
}
