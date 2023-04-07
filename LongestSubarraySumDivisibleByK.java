import java.util.HashMap;

public class LongestSubarraySumDivisibleByK {
    public static void main(String[] args) {
        int a[] = {-2, 2, -5, 12, -11, -1, 7};
        int res = longSubarrWthSumDivByK(a,a.length,3);
        System.out.println(res);
    }

//    Concept - Here we store the first occurence of each remainder in a Hashmap
//    if at any sum, sum % k == remainder present in the hashmap, it means that the sum of all the elements between them is divisible by k
//    eg arr = [2,7,6,1,4,5]
//    the hashmap would look like - {(0,-1),(2%3,0),(2+7 % 3,1),(2+7+6 % 1,2),
//                                      (2+7+6+1 % 3,3),(2+7+6+1+4 % 3,4)....}

//    which gives {(0,-1),(2,0),(0,1),(0,2),(1,3),(2,4)....} - so when the remainders are repeated, the remainder of the value of sum between them is same
    static int longSubarrWthSumDivByK(int a[], int n, int k)
    {
        int max = 0;
        int sum = 0;
        int rem = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);  // initializing the map with a remainder zero as 0 %k = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + a[i];
            rem = sum % k;
//            if remainder is negative we add k to make it positive
            rem +=(rem < 0)? k:0;
            if(sum%k == 0){
                max = Math.max(max, i+1);
            }

            if(map.containsKey(rem)){
                max = Math.max(max,i-map.get(rem));
            }

            if(!map.containsKey(rem)){
                map.put(rem,i);
            }
        }
        return max;
    }
}
