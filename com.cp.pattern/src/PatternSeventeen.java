import java.util.Scanner;

//https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-before-starting-dsa/
public class PatternSeventeen {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        System.out.println("Enter Input : ");
        int n = scr.nextInt();

        for (int i = 0; i < n; i++) {
            char alphabet ='A';
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }/*
            System.out.println((2*i+1));
            System.out.println((2*i+1)/2);*/

            for (int j = 0; j < (2*i+1); j++) {
                if (j>=(((2*i+1)+1)/2)-1){
                    System.out.print(alphabet--);
                }else {
                    System.out.print(alphabet++);
                }

            }
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        scr.close();
    }
}
