public class Armstrong {
    public static void main(String[] args) {
        int n =170;
        int check=n;
        int org=n;
        int count=0;
        while(n>0){
            n = n/10;
            count++;
        }
        int number = 0;
        while (org>0){
            int rem = org%10;
            number+= (int) Math.pow(rem,count);
            org/=10;
        }
        System.out.println(check==number);
    }
}
