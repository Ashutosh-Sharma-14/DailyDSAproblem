public class WifiRange {
    public static void main(String[] args) {
        boolean res = wifiRange(7,"1001000",2);
        System.out.println(res);
    }

    static boolean wifiRange(int N, String S, int X){
        int i = 0;
        int j = 0;
        int first = 0;
        while(j < N){
            if(S.charAt(j) == '1'){
                first = j;
                break;
            }
            j++;
        }

        if(first - 0 > X){
            return false;
        }

        j = first;
        i = first;

        while(j < N){
            if (S.charAt(j) == '1') {
                if(j-i-1> 2*X){
                    return false;
                }
                else{
                    i = j;
                    j++;
                }
            }
            else{
                j++;
            }
        }

        if(N-i-1 > X){
            return false;
        }
        return true;
    }
}
