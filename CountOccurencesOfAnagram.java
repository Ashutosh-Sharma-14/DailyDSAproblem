import java.util.Arrays;

public class CountOccurencesOfAnagram {
    public static void main(String[] args) {
        String txt = "kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk";
        String pat = "kkkkk";
        int res = search(pat,txt);
        System.out.println(res);
        System.out.println(txt.length());
    }

    static int search(String pat, String txt){
        int[] pattern = new int[26];
//        Arrays.fill(pattern,0);
        int[] text = new int[26];
//        Arrays.fill(text, 0);
        for (int i = 0; i < pat.length(); i++) {
            pattern[txt.charAt(i) - 'a']++;
            text[pat.charAt(i) - 'a']++;
        }

        int count = 0;
        int i = 0;
        int j = pat.length()-1;
        while(j < txt.length()){
            if(Arrays.equals(text, pattern)) {
                count+=1;
            }
            j++;
            if(j!=txt.length()){
                text[txt.charAt(i) - 'a'] -= 1;
                i++;
                text[txt.charAt(j)-'a'] += 1;
            }
        }

        return count;
    }
}
