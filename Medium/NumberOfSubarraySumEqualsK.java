package Medium;

import java.util.HashMap;

public class NumberOfSubarraySumEqualsK {
    public static void main(String[] args) {

    }

    static int subarraySumEqualsK(int[] arr, int k){
        int count = 0;
        int sum = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            if(map.containsKey(sum-k)){
                count+= map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }

        return count;
    }
}
