//https://takeuforward.org/c-programs/reverse-a-number-in-c/
public class ReverseNumber {
    public static void main(String[] args) {
        int n =243;
        int rev=0;
        while (n>0){
            int rem = n%10;
            /*
            * 3 -> rem = 3, rev = 0*10 + 3, rev =3
            * 4 -> rem = 4, rev = 30 + 4, rev = 34
            * 2 -> rem = 2, rev = 340 + 2 = 342            *
            * */
            rev = rev*10 + rem;
            n = n/10;
        }
        System.out.println(rev);
    }
}
