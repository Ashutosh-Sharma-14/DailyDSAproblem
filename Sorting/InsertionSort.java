package Sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {1,4,3,9,7};
        int[] res = insertionSort(arr,arr.length);
        for (int i = 0; i < res.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static int[] insertionSort(int[] arr,int n){
        for (int i = 0; i < n; i++) {
            for(int j = i;j >= 0; j--){
                if(j>0 && arr[j-1] > arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        
        return arr;
    }
}
