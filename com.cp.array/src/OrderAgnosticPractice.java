public class OrderAgnosticPractice {

    public static int AgnosticSearch(int [] arr, int target){
        if(arr[0]>arr[arr.length-1]){
            return bs(arr,target,false);
        }
        return bs(arr,target,true);
    }

    public static int bs(int [] arr, int target, boolean isAsc){
        int start=0;
        int end=arr.length-1;
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
    public static void main(String[] args) {
        int [] arr = {10,9,8,7,6,5,4,3,2,1};
        //int [] arr = {1,2,3,4,5,6,7};
        int target = 5;
        int res = AgnosticSearch(arr,target);
        System.out.println(res);
    }
}
