import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayInGroups {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 1; i < 6; i++) {
            arr.add(i);
        }
        reverseInGroups(arr,arr.size(),3);
        for (Integer i: arr) {
            System.out.print(i + " ");
        }
    }

    static void reverseInGroups(ArrayList<Integer> arr, int n, int k){
        int t = n - n%k;
        for (int i = k; i <= t; i+=k) {
            Collections.reverse(arr.subList(i-k,i));
        }
        Collections.reverse(arr.subList(t,n));
    }
}
