import java.util.ArrayList;

public class CountTriplets
{
    public static void main(final String[] args) {
        final int[] arr = { 1, 5, 3, 2 };
        final int res = countTriplets(arr, arr.length);
        System.out.println(res);
    }
    
    static int countTriplets(final int[] arr, final int n) {
        int count = 0;
        if (n < 3) {
            return 0;
        }
        final ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < n; ++i) {
            list.add(arr[i]);
        }
        int sum = 0;
        for (int j = 0; j < n - 1; ++j) {
            for (int k = j + 1; k < n; ++k) {
                sum = arr[j] + arr[k];
                if (list.contains(sum)) {
                    ++count;
                }
            }
        }
        return count;
    }
}