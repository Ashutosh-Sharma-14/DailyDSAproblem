package Medium;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class MaximumValSubarraySizeK {
    public static void main(String[] args) {
        int[] arr = {15, 7, 32, 19, 26, 8, 4, 10, 27, 11, 35, 14, 22, 30, 6, 9, 13, 31, 18, 12, 23, 5, 16, 20, 28, 25, 3, 1, 33, 17, 2, 29, 21, 24, 36, 37, 34, 38, 40, 39};
        ArrayList<Integer> ans = maxOfSubarrays(arr,arr.length,5);
        System.out.println("Maximum value in each subarray of size k");
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
    }

    static ArrayList<Integer> maxOfSubarrays(int arr[], int n, int k){
        ArrayList<Integer> res = new ArrayList<>();
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());

        for(int i = 0; i < k; i++){
            q.add(arr[i]);
        }
        res.add(q.peek());

        for (int i = k; i < n; i++) {
            q.add(arr[i]);
            q.remove(arr[i-k]);
            res.add(q.peek());
        }
        return res;
    }
}
