public class KoKoBananas {
    public static int minEatingSpeed(int[] piles, int h) {
        int max=0;
        int total=0;
        for(int num:piles){
            max=Math.max(max,num);
        }
        int start=1,end=max;
        while (start<=end){
            int mid=start+(end-start)/2;
            if(isValid(piles,h,mid)){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return start;
    }
    public static boolean isValid(int [] nums, int max_hours, int hours){
        long sum=0;
        for(int num:nums){
            sum+=Math.ceilDiv(num,hours);
            if(sum>max_hours)return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int [] nums={3,6,7,11};
        int hours=8;
        int res=minEatingSpeed(nums,hours);
        System.out.println(res);
    }
}
