import java.io.*;
import java.math.*;
import java.security.*;
import java.sql.SQLOutput;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class CheckSum {

    public static int solution(String n) {
        // Your logic goes here
        int checksum=0;
        for(int i=n.length()-1; i>=0;i--){
            int index=(n.length()-1)-i;
            char curr = n.charAt(i);
            if(index%2==0){
                int sum=(Character.getNumericValue(curr)*2);
                if(sum>=10){
                    sum=sum-9;
                }
                checksum+=sum;
            }else{
                checksum+=Character.getNumericValue(curr);
            }
        }

        if (checksum%10==0){
            checksum=0;
        }else {
            checksum=10-(checksum%10);
        }

        return checksum;
    }
    public static void main(String[] args) throws IOException {

        String n = "13";


        int result = CheckSum.solution(n);

        System.out.println(result);
    }
}
