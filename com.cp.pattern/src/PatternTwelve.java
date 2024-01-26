import java.util.Scanner;

//https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-before-starting-dsa/
public class PatternTwelve {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        System.out.println("Enter Input : ");
        int n = scr.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print(j+1);
            }
            for (int j = 0; j < (2*n)-2*(i+1); j++) {
                System.out.print(" ");
            }
            for (int j = i; j >=0 ; j--) {
                System.out.print(j+1);
            }
            System.out.println();
        }
        scr.close();
    }
}
