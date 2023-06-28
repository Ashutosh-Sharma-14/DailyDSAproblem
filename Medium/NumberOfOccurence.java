//Given a sorted array Arr of size N and a number X,
//  you need to find the number of occurrences of X in Arr

package Medium;

public class NumberOfOccurence {
    public static void main(String[] args) {
        int[] arr = {10,11};
        int res = count(arr, arr.length, 11);
        System.out.println(res);
    }

    static int count(int[] arr, int n, int x){
        int rightMost = findRightMost(arr,n,x);
        System.out.println(rightMost);
        int leftMost = findLeftMost(arr,n,x);
        System.out.println(leftMost);
        if(rightMost == -1 || leftMost == -1){
            return -1;
        }
        else return rightMost-leftMost+1;
    }

    static int findLeftMost(int[] arr,int n, int x){
        int low = 0, high = n - 1;
        int left = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            // maybe an answer
            if (arr[mid] == x) {
                left = mid;
                // look for smaller index on the left
                high = mid - 1;
            } else if (arr[mid] < x) {
                low = mid + 1; // look on the right
            } else {
                high = mid - 1; // look on the left
            }
        }
        return left;
    }

    static int findRightMost(int[] arr, int n, int x){
        int right = -1;
        int low = 0;
        int high = n-1;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(arr[mid] == x){
                right = mid;
                low = mid+1;
            }
            else if (arr[mid] < x) {
                low = mid + 1; // look on the right
            } else {
                high = mid - 1; // look on the left
            }
        }
        return right;
    }

}
