import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'solution' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING inputarr as parameter.
     */

    public static String solution(String inputarr) {
        // Your solution goes here
        String[] input = inputarr.split("[,\\s]+");
        int [] nums = new int[input.length];

        for(int i=0;i<input.length;i++){
            nums[i]=Integer.parseInt(input[i]);
        }

        Arrays.sort(nums);

        StringBuilder res = new StringBuilder();
        for(int i=nums.length-1;i>=0;i--){
            if(i!=nums.length-1){
                res.append(",");
            }
            res.append(nums[i]);
        }

        return res.toString();
    }

    public static void main(String[] args) throws IOException {

        String inputStr = "1000  ,2,3, 2";

        String result = Result.solution(inputStr);
        System.out.println(result);

    }
}
