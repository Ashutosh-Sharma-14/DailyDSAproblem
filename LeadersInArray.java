import java.util.ArrayList;
import java.util.Collections;

public class LeadersInArray {
    public static void main(String[] args) {
        int[] arr = {1,0,26,15,14,13,12,11,10,16,17,21,22,25,29,30,2,3,19,88};
        ArrayList<Integer> res = leaders(arr,arr.length);
        for (Integer i : res) {
            System.out.print(i + " ");
        }
    }

    static ArrayList<Integer> leaders(int[] arr,int n){
        ArrayList<Integer> list = new ArrayList<>();
        int leader = arr[n-1];
        list.add(leader);
        for (int i = n-2; i >=0 ; i--) {
            if(arr[i] >= leader){
                leader = arr[i];
                list.add(leader);
            }
        }
        Collections.reverse(list);
        return list;
    }
}
