import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListReversing {
    static List<Integer> getReversed(List<Integer> source) {
        Collections.reverse(source);
        return source;
    }
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList( 7, 17, 13, 19, 5 );
        List<Integer> result = ArrayListReversing.getReversed(numbers);
        System.out.println(result);
    }
}
