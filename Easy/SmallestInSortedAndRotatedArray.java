package Easy;

public class SmallestInSortedAndRotatedArray {
    public static void main(String[] args) {
    }

    int findMin(int[] arr, int n){
        int bp = -1;
        int l = 0;
        int h = n-1;

        while(l <= h){
            int m = l + (h-l)/2;
            if(m>0 && arr[m] < arr[m-1]){
                bp = m;
                return arr[m];
            }
            else if(arr[m] > arr[l]){
                l = m+1;
            }
            else{
                h = m - 1;
            }
        }
        if(bp == -1){
            return arr[0];
        }
        return 0;
    }
}
