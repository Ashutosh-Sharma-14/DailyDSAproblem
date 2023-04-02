import java.util.Stack;

// 
// Decompiled by Procyon v0.5.36
// 

public class StringRPorPR
{
    public static void main(final String[] args) {
        final String s = "prpptppr";
        final long res = solve(7, 7, s);
        System.out.println(res);
    }
    
    static long[] get_value(final char c1, final char c2, final String s) {
        final Stack<Character> s2 = new Stack<Character>();
        final Stack<Character> s3 = new Stack<Character>();
        int count1 = 0;
        int count2 = 0;
        s2.push(s.charAt(0));
        for (int i = 1; i < s.length(); ++i) {
            if (!s2.empty() && s.charAt(i) == c2 && s2.peek() == c1) {
                s2.pop();
                ++count1;
            }
            else {
                s2.add(s.charAt(i));
            }
        }
        s3.add(s2.pop());
        while (!s2.empty()) {
            if (!s3.empty() && s2.peek() == c2 && s3.peek() == c1) {
                ++count2;
                s3.pop();
            }
            else {
                s3.add(s2.peek());
            }
            s2.pop();
        }
        if (c1 == 'p') {
            return new long[] { count1, count2 };
        }
        return new long[] { count2, count1 };
    }
    
    static long solve(final int X, final int Y, final String S) {
        long[] frequency = new long[2];
        if (X > Y) {
            frequency = get_value('p', 'r', S);
        }
        else {
            frequency = get_value('r', 'p', S);
        }
        return frequency[0] * X + frequency[1] * Y;
    }
}