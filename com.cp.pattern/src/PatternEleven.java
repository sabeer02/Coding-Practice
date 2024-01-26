import java.util.Scanner;

//https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-before-starting-dsa/
public class PatternEleven {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        System.out.println("Enter Input : ");
        int n = 5;
        for (int i = 0; i < n; i++) {
            int start =1;
            if(i%2==0) start=1;
            else start=0;
            for (int j = 0; j <= i; j++) {
                System.out.print(start);
                start=Math.abs(start-1);
            }
            System.out.println();
        }
        scr.close();
    }
}
