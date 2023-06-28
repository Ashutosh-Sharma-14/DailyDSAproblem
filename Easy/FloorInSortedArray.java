//Given a sorted array arr[] of size N without duplicates, and given a value x.
// Floor of x is defined as the largest element K in arr[] such that K is smaller than or equal to x. Find the index of K(0-based indexing).

package Easy;

public class FloorInSortedArray {
    public static void main(String[] args) {
        long[] arr = {1,2,8,10,11,12,19};
        int res = findFloor(arr,arr.length,5);
        System.out.println(res);
    }

    static int findFloor(long arr[], int n, long x)
    {
        int low = 0;
        int high = n-1;
        int ans = -1;

        while(low <= high){
            int mid = low + (high-low)/2;

            if(arr[mid] == x){
                return mid;
            }
            else if(arr[mid] < x){
                ans = mid;
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return ans;
    }
}
