import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNoWithinRange {
    static void printPrime(int start, int end){
        if (start==end){
            System.out.println("-1");
        }else {
            List<Integer> res = new ArrayList<>();
            for (int i = start; i < end; i++) {
                if(checkPrime(i)){
                    res.add(i);
                }
            }
            if(res.isEmpty()){
                System.out.println("-1");
            }else {
                for (Integer re : res) {
                    System.out.print(re + " ");
                }
            }
        }

    }
    static Boolean checkPrime(int n){
        if(n<=1){
            return false;
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int start = scr.nextInt();
        int end = scr.nextInt();
        printPrime(start,end);
    }
}
