package Easy;

import java.util.ArrayList;

public class ClosestPair {
    public static void main(String[] args) {
        int[] arr = {1,4,5,7};
        int[] brr = {10,20,30,40};
        int x = 50;
        ArrayList<Integer> ans = printClosest(arr,brr,arr.length,brr.length,x);
        int diff = x-ans.get(0)-ans.get(1);
        System.out.println("The pair is: " + ans.get(0) + "," + ans.get(1));
        System.out.println("The difference is: " + diff);
    }

    static ArrayList<Integer> printClosest(int arr[], int brr[], int n, int m, int x){
        int min = Integer.MAX_VALUE;
        int i = 0;
        int j = m - 1;
        int a = -1, b = -1;
        while(i<n && j>=0){
            int sum = arr[i] + brr[j];
            int diff = Math.abs(x - sum);
            if(diff < min){
                min = diff;
                a = arr[i];
                b = brr[j];
            }
            if(sum > x)
                j--;
            else if(sum < x)
                i++;
            else
                break;
        }
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(a);
        ans.add(b);
        return ans;
    }
}
