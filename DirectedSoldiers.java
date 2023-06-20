import java.util.ArrayList;

public class DirectedSoldiers {
    public static void main(String[] args) {
        int[] a = {0, 1 ,1, 0, 1, 1, 1, 0 ,1 };
        int res = directedSoldiers(a.length,a);
        System.out.println(res);
    }

    static int directedSoldiers(int n, int []a) {
        // Write your code here.
        int ans = 0;
        ArrayList<Integer> lst = new ArrayList<>();

        // Copy array to ArrayList
        for (int num : a) {
            lst.add(num);
        }
        for(int i = 0; i < lst.size()-1;i++){
            if(lst.get(i) == 1 && lst.get(i+1) == 0){
                lst.remove(i);
                lst.remove(i);
                i-=2;
                ans++;
            }
        }
        return ans;
    }
}
