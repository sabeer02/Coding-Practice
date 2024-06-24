public class checkPalindrome {
     static boolean CheckPalindrome(String str, int i,int j){
        if(i<j && j< str.length()){
            System.out.print(str.charAt(i) + " ");
            System.out.println(str.charAt(j));
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            return CheckPalindrome(str,++i,--j);
        }
        return true;
    }
    public static void main(String[] args) {
        String name = "ABdcBA";
        System.out.println(CheckPalindrome(name,0,name.length()-1));
    }
}
