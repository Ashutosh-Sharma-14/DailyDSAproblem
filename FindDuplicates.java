import java.util.ArrayList;

public class FindDuplicates {
    public static void main(String[] args) {
        int[] arr = {2,3,1,2,3};
        ArrayList<Integer> ans = duplicates(arr,arr.length);
        System.out.println(ans);
    }

    static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();

        for(int val: arr){
            res.add(val);
        }

        for (int i = 0; i < n; i++) {
            int value = res.get(arr[i]);
            res.set(arr[i], value + 1);
        }

        int j = 0;
        for (int i = 0; i < n; i++) {
            int updatedValue = res.get(i) - arr[j];
            if(updatedValue < 2){
                 res.remove(i);
                 i--;
                 n--;
            }
            else{
                res.set(i,j);
            }
            j++;
        }

        if(res.size()>0){
            return res;
        }
        else{
            res.add(-1);
            return res;
        }
    }
}
