//https://leetcode.com/problems/sort-characters-by-frequency/

package Easy;

public class MaximumNestingDepthParenthesis {
    public static void main(String[] args) {

    }

    static int maxDepth(String s){
        int maxcounter = 0;
        int counter = 0;

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '('){
                counter++;
            }
            else if(s.charAt(i) == ')'){
                counter--;
            }
            else{
                continue;
            }
            maxcounter = Math.max(maxcounter,counter);
        }
        return maxcounter;
    }
}
