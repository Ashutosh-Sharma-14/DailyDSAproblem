import java.lang.reflect.Array;
import java.util.ArrayList;

public class BeautifulArray {
    public static void main(String[] args) {

    }

    static ArrayList<Integer> makeBeautiful(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int n = list.size();
            if(n == 0){
                list.add(arr[i]);
            }
            else if((list.get(n-1) < 0 && arr[i] >=0) || (list.get(n-1) >= 0 && arr[i] <0)){
                list.remove(n-1);
            }
            else{
                list.add(arr[i]);
            }
        }
        return list;
    }
}
