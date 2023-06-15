package Sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1,4,3,9,7};
        int[] res = bubbleSort(arr,arr.length);
        for (int i = 0; i < res.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static int[] bubbleSort(int[] arr,int n){
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if(arr[i] > arr[j]){
                    swap(arr,i,j);
                }
            }
        }
        return arr;
    }

    static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
