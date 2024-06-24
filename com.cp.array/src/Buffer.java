import java.lang.*;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Buffer {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	int input_1 = Integer.parseInt(reader.readLine());
	int input_2 = Integer.parseInt(reader.readLine());
	System.out.print(input_1 + " " + input_2);
        //your code goes here
    }
}
