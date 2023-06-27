import java.util.ArrayList;

public class MajoritySumVariation {
    public static void main(String[] args) {

    }

    static ArrayList<Integer> majority(int[] nums){
        ArrayList<Integer> res = new ArrayList<>();
        int firstmajor = -1;
        int secondmajor = -1;
        int firstsum = 0;
        int secondsum = 0;
        int n = nums.length;

//        this loop signifies the voting procedure where we are concerned with the number of votes of 2 major elements
        for (int i = 0; i < n; i++) {
//            if one of the considered elements occurs, add 1 to its counter
            if(nums[i] == firstmajor){
                firstsum++;
            }
            else if (nums[i] == secondmajor){
                secondsum++;
            }
//            if the counter of the considered element becomes zero at index i, consider the element at index i as the new element in consideration
            else if(firstsum == 0){
                firstmajor = nums[i];
                firstsum = 1;
            }
            else if(secondsum == 0){
                secondmajor = nums[i];
                secondsum = 1;
            }
//            if none of the considered element occurs, decrease their counters
            else{
                firstsum--;
                secondsum--;
            }
        }

        firstsum = 0;
        secondsum = 0;
//        count the number of votes for the elements in consideration, at least one of them has value greater than n/3
        for (int i = 0; i < n; i++) {
            if(nums[i] == firstmajor){
                firstsum++;
            }
            else if(nums[i] == secondmajor){
                secondsum++;
            }
        }

        if(firstsum > n/3){
            res.add(firstmajor);
        }
        if(secondsum > n/3){
            res.add(secondmajor);
        }

        return res;
    }
}
