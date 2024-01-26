import java.util.Scanner;

//https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-before-starting-dsa/
public class PatternEighteen {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        System.out.println("Enter Input : ");


        int n = scr.nextInt();
        for (int i = 0; i < n; i++) {
            char a = 'A';
            for (int j = 0; j <= i; j++) {
                int asciiValue=a+n-(i+1);
                char[] value = Character.toChars(asciiValue);
                char alpha = value[0];
                System.out.print(alpha + " ");
                a++;
            }
            System.out.println();
        }
        scr.close();
    }
}
