import java.io.File;
import java.lang.reflect.Field;
import java.util.Objects;
import java.util.Stack;

public class TowerOfHanoi {
    private int disk;
    Stack<Integer> from = new Stack<>();
    Stack<Integer> to = new Stack<>();
    Stack<Integer> aux = new Stack<>();
    public TowerOfHanoi(int n){
        this.disk=n;
        from = new Stack<>();
        to = new Stack<>();
        aux = new Stack<>();
        for (int i = n; i >=1 ; i--) {
            from.push(i);
        }

    }
    public void solve(){
        moveDisk(disk, from, to,aux);
    }
    public void moveDisk(int n, Stack<Integer> from , Stack<Integer> to, Stack<Integer> aux){
        if(n>0){
            moveDisk(n-1,from,aux,to);
            move(from,to);
            moveDisk(n-1,aux,to,from);
        }
    }
    public void move(Stack<Integer> from, Stack<Integer> to){
        System.out.print("Moving element from" + from.getClass().toString() + "to " + to.getClass().toString());
        System.out.println(" Element : " + to.peek());
        to.push(from.pop());
    }
    public static void main(String[] args) {
        TowerOfHanoi toh = new TowerOfHanoi(3);
        toh.solve();
    }
}
