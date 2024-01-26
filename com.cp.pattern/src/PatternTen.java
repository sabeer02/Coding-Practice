import java.util.Scanner;

//https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-before-starting-dsa/
public class PatternTen {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        System.out.println("Enter Input : ");
        int n = scr.nextInt();
        for (int i = 0; i < 2*n; i++) {
            int col = i > n ? 2*n-i:i;
            for (int j = 0; j < col; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        scr.close();
    }
}
