import java.util.ArrayList;
import java.util.HashMap;

public class CountDistinctElementsEveryWindow {
    public static void main(String[] args) {
        int[] arr = {1,2,1,3,4,2,3};
        ArrayList<Integer> ans = countDistinct(arr,arr.length,4);
        for (Integer i:ans) {
            System.out.print(i + " ");
        }
    }

    static ArrayList<Integer> countDistinct(int[] A, int n, int k){
        ArrayList<Integer> res = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        int left = 0;
        int right = 0;
        int count = 0;

        for (int j = 0; j < k; j++) {
            map.put(A[j],map.getOrDefault(A[j],0)+1);
        }
        res.add(map.size());
        for (right = k; right < n; right++) {
            map.put(A[left],map.get(A[left])-1);
            if(map.get(A[left]) == 0){
                map.remove(A[left]);
            }
            left++;
            map.put(A[right],map.getOrDefault(A[right],0)+1);
            res.add(map.size());
        }
        return res;
    }
}
