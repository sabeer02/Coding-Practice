public class BouquetsBinarySearch {
    public static int minDays(int[] bloomDay, int number, int flowers) {
        if((long)(number*flowers) > bloomDay.length)return -1;
        int low=Integer.MAX_VALUE;
        int high=0;
        for(int num:bloomDay){
            low=Math.min(num,low);
            high=Math.max(num,high);
        }
        while (low<=high){
            int day = low + (high-low)/2;
            if(isValid(bloomDay,number,flowers,day)){
                high=day-1;
            }else {
                low=day+1;
            }
        }
        return low;
    }

    public static boolean isValid(int [] nums, int number, int flowers, int day){
        int sum=0;
        int count=0;
        for(int num:nums){
            if(num<=day){
                sum++;
                if(sum==flowers){
                    count++;
                    sum=0;
                    if(count==number)return true;
                }
            }else {
                sum=0;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int [] nums={7,7,7,7,12,7,7};
        int no=2;
        int flowers=3;
        int res=minDays(nums,no,flowers);
        System.out.println(res);
    }
}
