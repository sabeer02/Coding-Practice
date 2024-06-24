public class CeilingOfANumber {
    public static void main(String[] args) {
        int [] arr = {1,2,3,6,7,8};
        int num = 5;
        int ceil=findCeil(arr,num);
        int floor=findFloor(arr,num);
        System.out.println("Floor :-" +arr[floor] + " Ceiling :- "+arr[ceil]);
    }

    private static int findCeil(int[] nums, int ele) {
        int start=0;
        int end= nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]<ele)start=mid+1;
            else if(nums[mid]>ele)end=mid-1;
            else return mid;
        }
        return start;
    }
    private static int findFloor(int[] nums, int ele) {
        int start=0;
        int end= nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]<ele)start=mid+1;
            else if(nums[mid]>ele)end=mid-1;
            else return mid;
        }
        return end;
    }
}
