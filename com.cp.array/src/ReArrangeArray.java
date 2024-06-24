import java.util.*;
public class ReArrangeArray {
    public static int[] alternateNumbers(int []a) {

        int even=0;
        int odd=1;
        int[] res = new int[a.length];

        for (int j : a) {
            if (j > 0) {
                res[even] = j;
                even += 2;
            } else {
                res[odd] = j;
                odd += 2;
            }
        }

        return res;
    }
    public static void main(String[] args) {
        int[] arr = {-2,-3,4,5};
        arr = alternateNumbers(arr);
        System.out.println(Arrays.toString(arr));

    }
}
