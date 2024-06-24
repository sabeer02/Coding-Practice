import java.util.HashSet;

public class LongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        int end=s.length(),maxlen=0,right_ptr=0;
        int[] arr=new int[128];
        for(int left_ptr=0;left_ptr<end;left_ptr++){
            int ptr=s.charAt(left_ptr);
            right_ptr=arr[ptr];
            maxlen=Math.max(maxlen,left_ptr-right_ptr+1);
            arr[ptr]=left_ptr+1;
        }
        return maxlen;
    }
    public static void main(String[] args) {
        String str = "abdcefabd";
        System.out.println(lengthOfLongestSubstring(str));

    }
}
