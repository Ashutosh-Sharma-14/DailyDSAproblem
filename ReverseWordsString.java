import java.util.Stack;

public class ReverseWordsString {
    public static void main(String[] args) {
        String s = "i.like.this.program.very.much";
        String output = reversewords(s);
        System.out.println(output);
    }

//    takes O(n^2) time complexity
    static String reversewords(String s){
        String res = "";
        Stack<String> stack = new Stack<>();
        for (int i = s.length()-1; i >=0 ; i--) {
            String c = "" + s.charAt(i);
            if(!c.equals(".")){
                stack.push(c);
            }
            else{
                while(!stack.isEmpty()){
                    res = res + stack.pop();
                }
                res = res + ".";
            }
        }
        while(!stack.isEmpty()){
            res = res + stack.pop();
        }
        return res;
    }

//    time complexity of O(n)
    static String ReverseWords(String S){
        String temp = "";
        String res = "";
        for (int i = S.length()-1; i >=0 ; i--){
            if(S.charAt(i) != '.'){
                temp = S.charAt(i) + temp;
            }
            else{
                temp = temp + S.charAt(i);
                res = res+temp;
                temp = "";
            }
        }
        res = res + temp;
        return res;
    }
}
