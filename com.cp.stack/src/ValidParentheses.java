import java.util.Objects;
import java.util.Stack;

public class ValidParentheses {
    static public boolean isValid(String s) {

        Stack<Character> stack = new Stack<Character>();
        for(char c: s.toCharArray())
        {
            if(c=='(')
                stack.push(')');
            else if (c=='{')
                stack.push('}');
            else if(c=='[')
                stack.push(']');
            else if(stack.isEmpty()||stack.pop()!=c)
                return false;
        }
        return stack.isEmpty();


        /*Stack<Character> stck = new Stack<>();
        for (char x : s.toCharArray()) {
            if (x == '(') {
                stck.add(')');
            } else if (x == '[') {
                stck.add(']');
            } else if (x == '{') {
                stck.add('}');
            } else if (!stck.empty() && stck.pop() != x) {
                return false;
            }
        }
        return stck.isEmpty();*/
    }
    public static void main(String[] args) {
        String s = "([])";
        System.out.println(isValid(s));
        int x =12;
        int y = x%7;
        System.out.println(y);
    }

}
