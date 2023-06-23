import java.util.HashMap;

public class LongestSubarraySumK {
    public static void main(String[] args) {

    }

    int lenOfLongSubarr(int A[], int N, int K){
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        int maxlen = 0;
        for(int i = 0; i< N; i++){
            sum += A[i];

            // if the sum of elements starting from index 0 to index i is equal to 0
            if(sum == K){
                maxlen = Math.max(maxlen, i+1);
            }

            // if differernce between sum of elements from index 0 to i is s and
            // a value of sum that is equal to s-k has occured before at index j then
            // the sum of the elements from index j to i is equal to k, which can be used to calculate the lenght of the subarray
            int remaining_sum = sum - K;
            if(map.containsKey(remaining_sum)){
                maxlen = Math.max(maxlen, i - map.get(remaining_sum));
            }

            // if the current sum is not present in the hashmap add it
            // we do not add every sum,index pair because there can be a sum which can be repeated at a later index
            // but we want to maximize the size of the subarray, so it wont give the correct resutls.
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }

        }
        return maxlen;
    }
}
