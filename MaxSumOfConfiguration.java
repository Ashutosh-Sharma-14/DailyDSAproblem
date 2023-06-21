// question link: https://practice.geeksforgeeks.org/problems/max-sum-in-the-configuration/1

public class MaxSumOfConfiguration {
    public static void main(String[] args) {
        int[] arr = {1,0,0,1,1,0,1,0,1,1,1};
        int res = maxSum(arr,arr.length);
        System.out.println(res);
    }

    static int maxSum(int A[], int n){
        int currSum = 0;
        int maxSum = 0;
        int initialSum = 0;

        for (int i = 0; i < n; i++) {
            initialSum = initialSum + A[i];
            currSum = currSum + A[i] * i;
        }
        maxSum = currSum;

        for (int i = 0; i < n-1; i++) {
            currSum = currSum - initialSum + A[i]*n;
            maxSum = Math.max(maxSum,currSum);
        }

        return maxSum;
    }
}
