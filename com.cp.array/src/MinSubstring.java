public class MinSubstring {
    public static String minWindow(String s, String t) {
        if(s == null || t ==null  || s.isEmpty() || t.isEmpty() || s.length() < t.length() ){
            return new String();
        }
        int start=0,end=0;
        int start_index=0,min=Integer.MAX_VALUE;
        int [] arr = new int[128];
        int count=t.length();
        for(char c : t.toCharArray()){
            arr[c]++;
        }
        char [] s_ch = s.toCharArray();
        while (end<s.length()){
            if(arr[s_ch[end]]>0){
                count--;
            }
            arr[s_ch[end]]--;
            end++;
            while (count==0){
                if(end-start<min){
                    start_index=start;
                    min=end-start;
                }
                if(arr[s_ch[start]]==0){
                    count++;
                }
                arr[s_ch[start]]++;
                start++;
            }
        }
        return min==Integer.MAX_VALUE?new String():new String(s_ch,start_index,min);

    }
    public static void main(String[] args) {
        String s = "ABCDEXYDAB";
        String t = "AXD";
        System.out.println(minWindow(s,t));
    }
}
