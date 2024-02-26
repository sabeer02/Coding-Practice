import java.util.*;
public class Fibonacci {
    private static long[] nthFibonacci;
    static void printFibonacciSeries(int num){
	nthFibonacci = new long[num+1];
	System.out.println(calcFibonacci(num));

    }
    static long calcFibonacci(int n){
    	if(n<=1){
	   return n;
	}
	if(nthFibonacci[n] == 0 ){
	  long fibonacci = (calcFibonacci(n-1)+calcFibonacci(n-2));
	  nthFibonacci[n] = fibonacci;
          return fibonacci;
	}
	return nthFibonacci[n];
    }
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
	int n = scr.nextInt();
        printFibonacciSeries(n);
    }
}
