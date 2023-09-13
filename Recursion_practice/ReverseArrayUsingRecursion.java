package Recursion_practice;

public class ReverseArrayUsingRecursion {
    public static void main(String[] args) {
        int arr[] = {1,2,3,5,6};
//        reverseArray(arr,0, arr.length-1);
        reverseArray2(arr,0);
        for (int i: arr){
            System.out.print(i + " ");
        }
    }

    static void reverseArray(int arr[], int low, int high){
        if(low > high) return;
        int temp = arr[low];
        arr[low] = arr[high];
        arr[high] = temp;

        reverseArray(arr,low+1,high-1);
    }

//    using single parameter
    static void reverseArray2(int[] arr, int i){
        if(i > arr.length-i-1) return;
        int temp = arr[i];
        arr[i] = arr[arr.length-i-1];
        arr[arr.length-i-1] = temp;

        reverseArray2(arr,i+1);
    }
}
