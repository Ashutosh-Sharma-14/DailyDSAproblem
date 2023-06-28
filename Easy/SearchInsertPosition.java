package Easy;

public class SearchInsertPosition {
    public static void main(String[] args) {

    }

    static int searchInsertK(int Arr[], int N, int k)
    {
        int low = 0;
        int high = N-1;
        int ans = -1;

        while(low <= high){
            int mid = low + (high-low)/2;

            if(Arr[mid] == k){
                return mid;
            }
            else if(Arr[mid] < k){
                ans = mid;
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return ans+1;
    }
}
