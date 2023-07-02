package Easy;

import java.util.HashMap;

public class IsomorphicString {
    public static void main(String[] args) {
        String str1 = "pijthbsfy";
        String str2 = "fvladzpbf";
        boolean res = areIsomorphic(str1,str2);
        System.out.println(res);
    }

    static boolean areIsomorphic(String str1, String str2){
        if(str1.length()!=str2.length()){
            return false;
        }
        HashMap<Character, Integer> m1 = new HashMap<>();
        HashMap<Character, Integer> m2 = new HashMap<>();

        for(Integer i = 0; i < str1.length(); i++) {

            if(m1.put(str1.charAt(i), i) != m2.put(str2.charAt(i), i)) {
                return false;
            }
        }
        return true;
    }
}
