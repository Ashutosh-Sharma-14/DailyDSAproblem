//Given a sorted and rotated array A of N elements which is rotated at some point, and may contain duplicates and given an element key.
// Check whether the key exist in the array A or not.
//
//        Example 1:
//
//        Input:
//        N = 7
//        A[] = {2,5,6,0,0,1,2}
//        key = 0
//        Output:
//        1
//        Explanation:
//        0 is found at index 3.
package Medium;

public class SearchInRotatedArray2 {
    public static void main(String[] args) {

    }

    static boolean search(int nums[],int target,int N){
        int low = 0;
        int high = N-1;

        while(low<=high){
            int mid = low + (high-low)/2;
            if(nums[mid] == target){
                return true;
            }

            if(nums[mid] == nums[low] && nums[mid] == nums[high]){
                low+=1;
                high-=1;
                continue;
            }

//            if left side of the mid is sorted
            if(nums[low] <= nums[mid]){
//                if the target lies between low and mid
                if(nums[low] <= target && nums[mid]>=target)
                    high = mid - 1;
                else
                    low = mid+1;
            }
//            if right side of the mid is sorted
            else{
                if(nums[mid] <= target && target<=nums[high])
                    low = mid+1;
                else
                    high = mid - 1;
            }
        }

        return false;
    }
}
