import java.util.Scanner;

//https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-before-starting-dsa/
public class PatternTwentyTwo {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        System.out.println("Enter Input : ");
        int n = scr.nextInt();
        for (int i = 0; i < 2*n; i++) {
            for (int j = 0; j < 2*n; j++) {
                int top=i;
                int left=j;
                int right=(2*n-1)-j;
                int bottom=(2*n-1)-i;
                System.out.print(n - Math.min(Math.min(top,left),Math.min(right,bottom)));
            }
            System.out.println();
        }
        scr.close();
    }
}
