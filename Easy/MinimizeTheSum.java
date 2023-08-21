package Easy;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MinimizeTheSum {
    public static void main(String[] args) {
        int arr[] = {1, 3, 7, 5, 6, 11, 14, 18, 20};
        long res = minimizeSum(arr.length,arr);
        System.out.println("The minimum sum of the array becomes: " + res);
    }

    static long minimizeSum(int N, int arr[]){
        if( N < 2){
            return 0;
        }
        PriorityQueue<Integer> min_q = new PriorityQueue<>();
        for(int i = 0; i< N;i++){
            min_q.add(arr[i]);
        }
        long sum = 0;
        while(min_q.size() > 1){
            int temp1 = min_q.poll();
            int temp2 = min_q.poll();
            sum = sum + temp1 + temp2;
            min_q.add(temp1+temp2);
        }
        return sum;
    }
}
