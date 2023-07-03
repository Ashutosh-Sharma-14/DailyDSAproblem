package Easy;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

    }

    static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        char[] arr1 = new char[26];
        char[] arr2 = new char[26];

        for(int i = 0; i < s.length();i++){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            arr1[c1-97]++;
            arr2[c2-97]++;
        }
        return Arrays.equals(arr1,arr2);
    }
}
