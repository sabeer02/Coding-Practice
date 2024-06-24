public class PeakMountainAndRotated {
    public static int findPeak(int [] arr){
        int start=0;
        int end=arr.length-1;
        while (start<end){
            int mid = start + (end-start)/2;
            if(arr[mid]>arr[start])start=mid+1;
            else end=mid-1;
        }
        return start;
    }
    public static int findRotatedPeak(int [] arr){
        int start=0;
        int end=arr.length-1;
        while (start<end){
            int mid = start + (end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1])return mid;
            else if (mid>start && arr[mid]<arr[mid-1]) {
                return mid-1;
            } else if (arr[mid]>arr[start]) {
                start=mid;
            } else end=mid-1;
        }
        return start;
    }
    public static void main(String[] args) {
        int [] peak = {2,3,4,5,6,5,4,3};
        int [] roated = {5,6,7,8,9,1,2,3,4};
        int peak_index=findPeak(peak);
        int rot_peak_index=findRotatedPeak(roated);
        System.out.println(peak_index + " "+ rot_peak_index);
    }
}
