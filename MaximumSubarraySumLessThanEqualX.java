import java.util.HashMap;

public class MaximumSubarraySumLessThanEqualX {
    public static void main(String[] args) {
        long[] arr = {2,3,4,8,10};
        long res = findMaxSubarraySum(arr,arr.length,7);
        System.out.println(res);
    }

    static long findMaxSubarraySum(long arr[], int N,int X)
    {
        // Your code goes here
        long max = 0;
        long sum = 0;
        int start = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);

        for (int i = 0; i < N; i++) {
            sum = sum + arr[i];
            while(sum > X){
                sum = sum - arr[start];
                start++;
            }
            max = Math.max(max,sum);
        }
        return max;
    }
}
