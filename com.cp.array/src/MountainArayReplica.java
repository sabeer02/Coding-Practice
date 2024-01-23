public class MountainArayReplica {
    static public int peakIndexMountainArray(int[] arr) {

        int start = 0;
        int end = arr.length-1;

        while (start<end){
            int mid = start + (end-start)/2;

            if(arr[mid+1]<arr[mid]){
                end=mid;
            }else {
                start=mid+1;
            }
        }
        return start;
    }
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int res = peakIndexMountainArray(arr);
        System.out.println(res);
    }
}
