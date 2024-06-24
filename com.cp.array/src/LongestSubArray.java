import java.util.ArrayList;
import java.util.List;

public class LongestSubArray {
    static void addList(List<Integer> lst,int start,int end,int[] arr){
        if(lst.size() > (end-start)) return;
        System.out.println("re");
        for (int i = start; i <= end; i++) {
            lst.add(arr[i]);
        }
    }
    public static void main(String[] args) {

        int [] arr = {2,3,5,1,9};
        int sub_total = 10;
        List<Integer> result = new ArrayList<>();
        int sum=0;

        for (int i = 0; i < arr.length-1; i++) {
            sum+=arr[i];
            for (int j = i+1; j < arr.length ; j++) {
                sum+=arr[j];
                if(sum==sub_total){
                    addList(result,i,j,arr);
                }
            }
        }

        System.out.println(result);
        System.out.println(result.size());

    }
}
