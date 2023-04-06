public class EqualLeftRightSubarray {
    public static void main(String[] args) {
        int[] A = {1,3,5,2,2};
        int res = equalSum(A, A.length);
        System.out.println(res);
    }

    static int equalSum(int [] A, int N) {
        int left_sum = 0;
        int right_sum = 0;
        if( N < 2){
            return 1;
        }

        for (int i = 1; i < N; i++) {
            right_sum += A[i];
        }
        int k = 0;
        while(k < N-1){
            if(left_sum == right_sum){
                return k+1;
            }
            else{
                left_sum += A[k];
                k++;
                right_sum -= A[k];
            }
        }
        return -1;
    }
}
