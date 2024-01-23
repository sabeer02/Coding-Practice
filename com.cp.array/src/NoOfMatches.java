public class NoOfMatches {
    static public int numberOfMatches(int n) {
        int countOfmatches = 0;
        while (n>1){
            countOfmatches+=n/2;
            if(n%2==0){
                n=n/2;
            }else {
                n=1+((n-1)/2);
            }
        }
        return countOfmatches;
    }
    public static void main(String[] args) {
        int teams = 14;
        int matches = numberOfMatches(teams);
        System.out.println(matches);
    }
}
