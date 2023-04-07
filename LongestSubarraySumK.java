import java.util.HashMap;

public class LongestSubarraySumK {
    public static void main(String[] args) {

    }

    int lenOfLongSubarr(int A[], int N, int K){
        int max = 0;
        int sum = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);

        for (int i = 0; i < N; i++) {
            sum = sum + A[i];
            if(sum == K){
                max = Math.max(max,i+1);
            }

            if(map.containsKey(sum-K)){
                max = Math.max(max, i - map.get(sum-K));
            }

            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
        }
        return max;
    }
}
