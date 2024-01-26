import java.util.Scanner;

//https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-before-starting-dsa/
public class PatternFourteen {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        System.out.println("Enter Input : ");
        int n = scr.nextInt();

        for (int i = 0; i < n; i++) {
            char count='A';
            for (int j = 0; j <=i; j++) {
                System.out.print(count++ + " ");
            }
            System.out.println();
        }
        scr.close();
    }
}
