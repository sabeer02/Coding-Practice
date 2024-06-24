public class PeakInRotated {
    public static int peakInRotated(int [] arr){
        int start=0;
        int end=arr.length-1;
        while (start<=end){
            int mid =start + (end-start)/2;
            if(mid < end && arr[mid]>arr[mid+1])return arr[mid];
            else if(mid>start && arr[mid-1]>arr[mid])return arr[mid-1];
            else if(arr[start]<arr[mid])start=mid;
            else end=mid-1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] arr = {4,1,2,3};
        int peak = peakInRotated(arr);
        System.out.println(peak);
    }
}
