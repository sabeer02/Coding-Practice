public class patternTest2 {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 0; i < n; i++) {
            int count = 1;
            //star
            for (int j = 0; j <= i; j++) {
                System.out.print(count++);
            }

            //gap
            for (int j = 0; j < 2*(n-i-1); j++) {

                System.out.print(" ");
            }

            //star
            for (int j = 0; j <= i; j++) {
                System.out.print(--count);
            }
            System.out.println();
        }
    }
}
