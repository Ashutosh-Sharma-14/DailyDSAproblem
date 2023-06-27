//Implement the next permutation, which rearranges the list of numbers into Lexicographically next greater permutation of list of numbers. If such arrangement is not possible, it must be rearranged to the lowest possible order i.e. sorted in an ascending order. You are given an list of numbers arr[ ] of size N.
//
//        Example 1:
//
//        Input: N = 6
//        arr = {1, 2, 3, 6, 5, 4}
//        Output: {1, 2, 4, 3, 5, 6}
//        Explanation: The next permutation of the
//        given array is {1, 2, 4, 3, 5, 6}.

package Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NextPermutation {
    public static void main(String[] args) {

    }

    static List<Integer> nextPermutation(int N, int arr[]){
//        finding the breaking point - first element from the back of the array that is smaller than its previous element
//        eg: In {1,2,3,4,5} - value 4 acts as a breaking point
        int breakPt = -1;
        for (int i = N-2; i >= 0; i--){
            if(arr[i] < arr[i+1]){
                breakPt = i;
                break;
            }
        }

//      if no breaking point i.e. the array is sorted in descending order
        if(breakPt == -1){
            List<Integer> lst  = new ArrayList<>();
            int i = N-1;
            while(i >=0){
                lst.add(arr[i]);
                i--;
            }
            return lst;
        }

//       now operations are performed only on the right side of the breakingpoint, the left side remains as it is because no permutation is required there
//        finding first number from the back that is greater than breakPoint and swap with the breakpoint
        for (int i = N-1; i > breakPt ; i--) {
            if(arr[i] > arr[breakPt]){
                int temp = arr[breakPt];
                arr[breakPt] = arr[i];
                arr[i] = temp;
                break;
            }
        }

//        now reverse the right side part of the breakpoint-index
//        List<Integer> sublist = list.subList(startIndex, endIndex + 1); - syntax for creating sublist in java
        int j = N-1;
        int k = breakPt+1;
        while(k <= j){
            int temp = arr[j];
            arr[j] = arr[k];
            arr[k] = temp;
            k++;
            j--;
        }

        List<Integer> lst  = new ArrayList<>();
        for(int num: arr){
            lst.add(num);
        }
        return lst;
    }
}
