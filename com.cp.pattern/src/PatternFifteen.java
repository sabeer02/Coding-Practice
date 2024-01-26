import java.util.Scanner;

//https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-before-starting-dsa/
public class PatternFifteen {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        System.out.println("Enter Input : ");
        int n = scr.nextInt();

        for (int i = 0; i < n; i++) {
            char count='A';
            for (int j = 0; j <=n-i-1; j++) {
                System.out.print(count++ + " ");
            }
            System.out.println();
        }
        scr.close();
    }
}
