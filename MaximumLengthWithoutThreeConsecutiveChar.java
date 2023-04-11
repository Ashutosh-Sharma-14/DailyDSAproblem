public class MaximumLengthWithoutThreeConsecutiveChar {
    public static void main(String[] args) {

    }

    int solve(int a, int b, int c){
        if(a > 2*(b+c+1)|| b > 2*(a+c+1) || c > 2*(a+b+1)){
            return -1;
        }
        else{
            return a+b+c;
        }
    }
}
