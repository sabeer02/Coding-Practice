import java.util.Stack;

public class InfixToPostfix {

    static public Boolean getPrecedence(char a,char b){
        int comp = Character.compare(a, b);
        if(comp>0){
            return false;
        }else{
            return true;
        }
    }


    static String postfixExpr(String infix){
        StringBuilder postfix = new StringBuilder();
        Stack<Character> post = new Stack<>();

        for (char ch:infix.toCharArray()) {
            if((ch == '+') || (ch == '-') || (ch == '/') || (ch == '*') || (ch == '^'))
            {
                if(post.size()!=0){

                    while(!getPrecedence(ch, post.peek())) {
                        postfix.append(post.peek());
                        System.out.println("ch= "+ch);
                        System.out.println("post.peek()= "+post.peek());
                        post.pop();
                    }
                }
                    post.push(ch);
            }else {
                postfix.append(ch);
            }
        }
        while (!post.isEmpty()){
            postfix.append(post.pop());
        }
        return postfix.toString();
    }
    public static void main(String[] args) {
        String infix = "A+B*C+D";
        StringBuilder strb = new StringBuilder(infix);
        strb.reverse();
        System.out.println(strb);
        String res = postfixExpr(infix);
        System.out.println(res);

    }
}
