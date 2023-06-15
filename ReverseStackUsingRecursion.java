import java.util.Queue;
import java.util.Stack;

public class ReverseStackUsingRecursion {

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        reverse(s);
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }

    static void reverse(Stack<Integer> s){
        if(s.isEmpty() || s.size()==1){
            return;
        }

        int topElement=s.pop();
        reverse(s);
        insertBottom(s,topElement);
    }

    static void insertBottom(Stack<Integer> s,int element){
        if(s.isEmpty()){
            s.push(element);
        }
        else{
            int top = s.pop();
            insertBottom(s,element);
            s.push(top);
        }
    }
}
