import java.util.Stack;

import static java.lang.Character.isDigit;

public class reversePolish {
    static public int evalRPN(String[] tokens) {

        Stack<Integer> infixx = new Stack<>();

        for (String ele:tokens) {
                infixx.push((ele.equals("+"))?(infixx.pop()+infixx.pop()):
                        (ele.equals("-"))?(infixx.pop()-infixx.pop()):
                                (ele.equals("*"))?(infixx.pop()*infixx.pop()):
                                        (ele.equals("/"))?(infixx.pop()/infixx.pop()):infixx.push(Integer.parseInt(ele)));
        }
        return infixx.peek();
    }
    public static void main(String[] args) {
        String[] tokens = new String[]{"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        int res = evalRPN(tokens);
        System.out.println(res);
    }
}
