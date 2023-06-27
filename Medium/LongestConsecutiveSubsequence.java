//Given an array of positive integers.
// Find the length of the longest sub-sequence such that elements in the subsequence are consecutive integers, the consecutive numbers can be in any order.
//        Example 1:
//
//        Input:
//        N = 7
//        a[] = {2,6,1,9,4,5,3}
//        Output:
//        6
//        Explanation:
//        The consecutive numbers here
//        are 1, 2, 3, 4, 5, 6. These 6
//        numbers form the longest consecutive
//        subsquence.
package Medium;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSubsequence {
    public static void main(String[] args) {

    }

    static int maxLengthOptimal(int[] arr, int N){
        Set<Integer> lst = new HashSet<>();
        for (int num: arr){
            lst.add(num);
        }

        int maxlen = 0;
        for(int num: arr){
            if(!lst.contains(num-1)){
                int len = 1;
                int currentval = num;

                while(lst.contains(currentval+1)){
                    currentval++;
                    len++;
                }
                maxlen = Math.max(maxlen,len);
            }
        }
        return maxlen;
    }

//    this approach will not be optimal as the space required can be 100000 and not N
    static int maxLength(int[] arr,int N){
        int[] temp = new int[100000];
        int maxNum = 0;
        for (int i = 0; i < N; i++) {
            temp[arr[i]]++;
            maxNum = Math.max(maxNum,arr[i]);
        }

        int len = 0;
        int maxlen = 0;
        for (int i = 0; i < maxNum; i++) {
            if(temp[i] == 1){
                len++;
            }
            else{
                len = 0;
            }
            maxlen = Math.max(maxlen,len);
        }

        return maxlen;
    }
}
