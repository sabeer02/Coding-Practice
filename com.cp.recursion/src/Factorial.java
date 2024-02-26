public class Factorial {
    public static int findFact(int n,int fact){
        if(n<=0) return fact;
        return findFact(n-1,fact*n);
    }
    public static void main(String[] args) {
        int n = 5;
        int fact=1;
        fact = findFact(n,fact);
        System.out.println(fact);

    }
}
