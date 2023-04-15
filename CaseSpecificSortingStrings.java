import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CaseSpecificSortingStrings {
    public static void main(String[] args) {
        String res = caseSort("defRTSersUXI");
        System.out.println(res);
    }

    static String caseSort(String str){
        int n = str.length();
        String lo = "";
        String up = "";
        String res = "";

        for (int i = 0; i < n; i++) {
            if(str.charAt(i) >= 'a'){
                lo += str.charAt(i);
            }
            else{
                up += str.charAt(i);
            }
        }

        char[] lower = lo.toCharArray();
        char[] upper = up.toCharArray();
        Arrays.sort(lower);
        Arrays.sort(upper);
        // char[] ans = new char[n];
        int i = 0;
        int j = 0;
        for (int l = 0; l < n; l++) {
            if(str.charAt(l) >= 'a' && str.charAt(i) <='z'){
                res += lower[i++];
            }
            else{
                res += upper[j++];
            }
        }
        return res;
    }
}
