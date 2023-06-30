package Medium;

public class SearchInRotatedArray {
    public static void main(String[] args) {

    }

    static int search(int nums[],int target){
        int bp = -1;
        int n = nums.length;
        int l = 0;
        int h = n-1;

        while(l <= h){
            int mid = l + (h-l)/2;
            if(mid<n-1 && nums[mid] > nums[mid+1]){
                bp = mid+1;
                break;
            }
            else if(nums[mid] > nums[0]){
                l = mid+1;
            }
            else{
                h = mid-1;
            }
        }

        if(target >= nums[0]){
            l = 0;
            h = bp-1;

            while(l <= h){
                int m = l + (h-l)/2;
                if(nums[m] == target){
                    return m;
                }
                else if(target > nums[m]){
                    l = m+1;
                }
                else{
                    h = m-1;
                }
            }
        }
        else{
            l = bp;
            h = n-1;

            while(l <= h){
                int m = l + (h-l)/2;
                if(nums[m] == target){
                    return m;
                }
                else if(target > nums[m]){
                    l = m+1;
                }
                else{
                    h = m-1;
                }
            }
        }
        return -1;
    }
}
