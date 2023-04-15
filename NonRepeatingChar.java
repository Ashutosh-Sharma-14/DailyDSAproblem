import java.util.ArrayList;
import java.util.HashMap;

public class NonRepeatingChar {
    public static void main(String[] args) {
        char ans = nonrepeatingCharacter("hello");
        System.out.println(ans);
    }

    static char nonrepeatingCharacter(String S){
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < S.length(); i++) {
            char k = S.charAt(i);
            if(map.containsKey(k)){
                map.put(k,map.get(k)+1);
            }
            else{
                map.put(k,1);
            }
        }
        char c = '$';
        for (char ch: S.toCharArray()) {
            if(map.get(ch) == 1){
                c = ch;
                break;
            }
        }
        return c;
    }
}
