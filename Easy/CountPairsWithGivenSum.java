package Easy;

import java.util.HashMap;

public class CountPairsWithGivenSum {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1};
        int res = getPairsCount(arr,arr.length,2);
        System.out.println(res);
    }

    static int getPairsCount(int[] arr, int n, int k) {
        // code here
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i]) + 1);
            }
            else{
                map.put(arr[i],1);
            }
        }

        int count = 0;

        for(int i = 0; i < n; i++){
            int rem = k-arr[i];

            if(map.containsKey(rem)){
                    map.put(arr[i], map.get(arr[i]) - 1);
                    count = count + map.get(rem);
            }
        }

        return count;
    }
}
