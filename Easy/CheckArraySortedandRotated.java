package Easy;

public class CheckArraySortedandRotated {
    public static void main(String[] args) {

    }

    static boolean check(int[] nums){
        int bp = -1;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if(nums[i] > nums[i+1]){
                bp = i+1;
                break;
            }
        }
        if(bp == -1){
            return true;
        }

        for (int i = bp; i < n; i++) {
            if(nums[i] > nums[0]){
                return false;
            }
        }
        return true;
    }
}
