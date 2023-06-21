// link of question: https://practice.geeksforgeeks.org/problems/maximize-number-of-1s0905/1

public class MaximizeNumberOfOnes {
    public static void main(String[] args) {
        int[] arr = {1,0,0,1,1,0,1,0,1,1,1};
        int res = maxOnes(arr,arr.length,2);
        System.out.println(res);
    }

    static int maxOnes(int[] arr, int n, int m){
        int countZero = 0;
        int maxOnes = 0;
        int start = 0;

        for (int end = 0; end < n; end++) {
            if(arr[end] == 0){
                countZero++;
            }

            while(countZero > m){
                if(arr[start] == 0){
                    countZero--;
                }
                start++;
            }

            maxOnes = Math.max(maxOnes,end-start+1);
        }

        return maxOnes;
    }
}
