import java.util.Scanner;

//https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-before-starting-dsa/
public class PatternTwentyTwo {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        System.out.println("Enter Input : ");
        int n = scr.nextInt();
        for (int top = 0; top < 2*n; top++) {
            for (int left = 0; left < 2*n; left++) {
                int right=(2*n-1)-left;
                int bottom=(2*n-1)-top;
                System.out.print(n - Math.min(Math.min(top,left),Math.min(right,bottom)));
            }
            System.out.println();
        }
        scr.close();
    }
}
