public class Palindrome {
    public static void main(String[] args) {
        int n = 242;
        int temp = n;
        int rev=0;
        while (n>0){
            int rem = n%10;
            /*
             * 2 -> rem = 2, rev = 0*10 + 3, rev =3
             * 4 -> rem = 4, rev = 30 + 4, rev = 34
             * 2 -> rem = 2, rev = 340 + 2 = 342            *
             * */
            rev = rev*10 + rem;
            /*
            * 0*2 + 2 = 2  => rev=2
            * 2*10 + 4  => 24
            * 240+2 => 242
            * */
            n = n/10;
        }
        System.out.println(temp==rev);
    }
}
