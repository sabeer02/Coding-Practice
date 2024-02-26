public class checkPalindrome {
     static boolean CheckPalindrome(String str, int i,int j){
        if(i<j && j< str.length()){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            return CheckPalindrome(str,++i,++j);
        }
        return true;
    }
    public static void main(String[] args) {
        String name = "ABAD";
        System.out.println(CheckPalindrome(name,0,name.length()-1));
    }
}
