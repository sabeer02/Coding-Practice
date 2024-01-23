import java.util.Stack;

public class MinStack {

    public static void main(String[] args) {
        Stack<Integer> stc = new Stack<>();
        int sum=0;
        int a=1;
        int b=2;
        int c='*';
        sum=(c=='+')?(a+b):(c=='-')?(a-b):(c=='*')?(a*b):0;
        stc.add(sum);
        System.out.println(stc.peek());
    }
}
