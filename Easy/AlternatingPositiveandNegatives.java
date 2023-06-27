package Easy;
import java.util.LinkedList;
import java.util.Queue;

public class AlternatingPositiveandNegatives {
    public static void main(String[] args) {

    }

    static void rearrange(int[] arr, int n){
        Queue<Integer> pos = new LinkedList<>();
        Queue<Integer> neg = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            if(arr[i] < 0){
                neg.add(arr[i]);
            }
            else{
                pos.add(arr[i]);
            }
        }

        int min_size = Math.min(pos.size(),neg.size());

        for (int i = 0; i < min_size; i++) {
            if(i%2 == 0){
                arr[i] = pos.remove();
            }
            else{
                arr[i] = neg.remove();
            }
        }

        int i = min_size;
        while(!pos.isEmpty()){
            arr[i] = pos.remove();
            i++;
        }
        while(!neg.isEmpty()){
            arr[i] = neg.remove();
            i++;
        }
    }
}
