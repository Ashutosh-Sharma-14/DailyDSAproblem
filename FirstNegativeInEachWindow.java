import java.util.ArrayList;

public class FirstNegativeInEachWindow {
    public static void main(String[] args) {
        long[] arr = {-8,2,3,-6,10};
        long[] res = printFirstNegativeInteger(arr, arr.length, 2);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }

    static long[] printFirstNegativeInteger(long A[], int N, int K){
        long[] arr = new long[N-K+1];

        int neg_index = 0;
        while(A[neg_index] > 0){
            neg_index++;
        }

        int start = 0;
        int end = K-1;
        while(end < N){
            if(neg_index >= start && neg_index<=end){
                arr[start] = A[neg_index];
            }
            else{
                neg_index = start;
                while(neg_index < N && A[neg_index] > 0){
                    neg_index++;
                }
                if(neg_index <= end){
                    arr[start] = A[neg_index];
                }
                else {
                    arr[start] = 0;
                }
            }
            start++;
            end++;
        }
        return arr;
    }
}
