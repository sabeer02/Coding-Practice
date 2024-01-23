public class ValidPalindrome {
    static public boolean isPalindrome(String s) {
        s= s.replaceAll("[^A-Za-z0-9]+","");
        s = s.toLowerCase();
        StringBuilder str= new StringBuilder(s);
        str.reverse();
        return (s.equals(str.toString()));
    }
    public static void main(String[] args) {
        String s = "0P";
        System.out.println(isPalindrome(s));
    }
}
