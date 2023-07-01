//Example 1:
//
//        Input: s = "the sky is blue"
//        Output: "blue is sky the"
// Example 2:
//
//        Input: s = "  hello world  "
//        Output: "world hello"
//        Explanation: Your reversed string should not contain leading or trailing spaces.

package Medium;

public class ReverseWordsInString {
    public static void main(String[] args) {

    }

    static String reverseWords(String s) {
        String res = "";
        String temp = "";
        char c = ' ';
        for(int i = s.length()-1; i >=0 ;i--){
            if(s.charAt(i)!=c){
                temp = s.charAt(i)+temp;
            }
            else{
                while(i >=0 && s.charAt(i)==c){
                    i--;
                }
                i++;
                if(temp.length()!=0){
                    temp = temp + " ";
                    res = res + temp;
                    temp = "";
                }
            }
        }
        res = res + temp;
        if(res.charAt(res.length()-1) == c){
            res = res.substring(0, res.length() - 1);
        }
        return res;
    }
}
