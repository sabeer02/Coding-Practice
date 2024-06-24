public class DistinctNumbers {
    public static int distinctNumber(int [] nums){
        int distinct=0;
        for(int num:nums){
            distinct^=num;
        }
        return distinct;
    }
    public static void main(String[] args) {
        int [] arr = {4,4,3,3,5,6,6};
        int res = distinctNumber(arr);
        System.out.println(res);
    }
}
