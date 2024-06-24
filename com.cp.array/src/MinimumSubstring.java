public class MinimumSubstring {

    public static String minWindow(String s, String t) {
        if (s == null || t == null || s.isEmpty() || t.isEmpty() || s.length() < t.length()) {
            return new String();
        }
        int start=0,end=0;
        int start_index=0,min=Integer.MAX_VALUE;
        int count=t.length();
        int [] arr = new int[128];
        for(char c:t.toCharArray()){
            arr[c]++;
        }
        char [] s_char = s.toCharArray();
        while (end<s_char.length){

            if(arr[s_char[end]]>0){
                count--;
            }
            arr[s_char[end]]--;
            end++;
            while (count==0){
                if(end-start<min){
                    start_index=start;
                    min=end-start;
                }
                if(arr[s_char[start]]==0){
                    count++;
                }
                arr[s_char[start]]++;
                start++;
            }
        }
        return min==Integer.MAX_VALUE?new String():new String(s_char,start_index,min);
    }

    public static void main(String[] args) {
        String str = "ADOBECODEBANC";
        String sub = "ABC";
        System.out.println(minWindow(str,sub));
    }
}
