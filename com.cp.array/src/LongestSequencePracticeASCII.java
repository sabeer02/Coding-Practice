public class LongestSequencePracticeASCII {
    public static int lengthOfLongestSubstring(String s) {
        int max=0;
        int [] arr = new int[128];
        for (int index = 0,start=0; index < s.length(); index++) {
            int ascii = s.charAt(index);
            start= Math.max(start,arr[ascii]);
            max=Math.max(max,index-start+1);
            arr[ascii]=index+1;
        }
        return max;
    }
    public static void main(String[] args) {
        String str = "pwwkew";
        System.out.println(lengthOfLongestSubstring(str));
    }
}
