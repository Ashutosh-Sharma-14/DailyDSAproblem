package Easy;

public class LargestOddNumberString {
    public static void main(String[] args) {

    }

    static String maxOdd(String s){
        int count = 0;
        for (int i = s.length()-1; i >= 0 ; i--) {
            int val = (int) s.charAt(i);
            if(val%2 == 1){
                break;
            }
            count++;
        }
        return s.substring(0,s.length()-1-count);
    }
}
