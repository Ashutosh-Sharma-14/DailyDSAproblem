package Sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {1,4,3,9,7};
        int[] res = selectionSort(arr,arr.length);
        for (int i = 0; i < res.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static int[] selectionSort(int[] arr,int n){
        for (int i = 0; i < arr.length-1; i++) {
            int minIndex = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            swap(arr,i,minIndex);
        }
        return arr;
    }

    static void swap(int[] arr,int i,int pos){
        int temp = arr[i];
        arr[i] = arr[pos];
        arr[pos] = temp;
    }
}
