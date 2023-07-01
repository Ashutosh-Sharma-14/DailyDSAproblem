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
