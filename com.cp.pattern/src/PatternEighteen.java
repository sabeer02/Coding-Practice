import java.util.Scanner;

//https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-before-starting-dsa/
public class PatternEighteen {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        System.out.println("Enter Input : ");


        int n = scr.nextInt();
        for (int i = 0; i < n; i++) {
            char a = 'E';
            for (int j = 0; j <= i; j++) {
                int asciiValue=a-i;
                char[] value = Character.toChars(asciiValue);
                System.out.print(value[0] + " ");
                a++;
            }
            System.out.println();
        }
        scr.close();
    }
}
