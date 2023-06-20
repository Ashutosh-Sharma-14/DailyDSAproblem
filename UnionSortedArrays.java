import java.util.ArrayList;

public class UnionSortedArrays {
    public static void main(String[] args) {

    }

    static ArrayList<Integer> union(int[] arr1, int[] arr2, int n, int m){
        ArrayList<Integer> res = new ArrayList<>();
        int i = 0;
        int j = 0;

        // arr1[ i ] == arr2[ j ]
        // Here we found a common element, so insert only one element in the union. Let’s insert arr[i] in union and increment i.

        // NOTE: There may be cases like the element to be inserted is already present in the union, in that case, we are inserting duplicates which is not desired. So while inserting always check whether the last element in the union vector is equal or not to the element to be inserted. If equal we are trying to insert duplicates, so don’t insert the element, else insert the element in the union. This makes sure that we are not inserting any duplicates in the union because we are inserting elements in sorted order.
        // arr1[ i ]  < arr2[ j ]
        /* arr1[ i ] < arr2[ j ] so we need to insert arr1[ i ] in union.
        IF last element in  union vector is not equal to arr1[ i ],then insert in union else don’t insert.
        After checking Increment i. */

        // arr1[ i ] > arr2[ j ]
        /* arr1[ i ] > arr2[ j ] so we need to insert arr2[ j ] in union.
        IF the last element in the union vector is not equal to arr2[ j ], then insert in the union, else don’t insert.
        After checking Increment j. */

        while(i < n && j < m){
            if(arr1[i] <= arr2[j]){
                int size = res.size();
                if(size == 0 || res.get(size)!=arr1[i]){
                    res.add(arr1[i]);
                }
                i++;
            }
            else{
                int size = res.size();
                if(size == 0 || res.get(size)!=arr2[j]){
                    res.add(arr1[j]);
                }
                j++;
            }
        }

//        adding the remaining elements{
        while(i < n){
            if(res.get(res.size()-1)!= arr1[i]){
                res.add(arr1[i]);
            }
            i++;
        }
        while(j < m){
            if(res.get(res.size()-1)!= arr2[j]){
                res.add(arr2[j]);
            }
            j++;
        }

        return res;
    }
}
