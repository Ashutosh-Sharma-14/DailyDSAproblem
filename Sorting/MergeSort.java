package Sorting;

import java.util.ArrayList;
import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 7;
        int arr[] = { 9, 4, 7, 6, 3, 1, 5 };
        System.out.println("Before sorting array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        mergeSort(arr, 0, n - 1);
        System.out.println("After sorting array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void merge(int[] arr, int l, int m, int r){
        ArrayList<Integer> temp = new ArrayList<>();
        int left = l;
        int right = m+1;

//        comparing the elements in the right and the left side of the array divided using the mid and adding them to the list
        while(left<=m && right<=r){
            if(arr[left] <= arr[right]){
                temp.add(arr[left]);
                left++;
            }
            else{
                temp.add(arr[right]);
                right++;
            }
        }

//        adding the remaining elemets to the list as it is
        while(left<=m){
            temp.add(arr[left]);
            left++;
        }
        while(right<=r){
            temp.add(arr[right]);
            right++;
        }

        for (int i = l; i <= r; i++) {
            arr[i] = temp.get(i-l);
        }
    }

    static void mergeSort(int[] arr,int l, int r){
        if(l >= r){
            return;
        }
        int mid = (l+r)/2 ;

//        sorting the left divided part
        mergeSort(arr,l,mid);
//        sorting the right divided part
        mergeSort(arr,mid+1,r);
//        merge the left and the right parts
        merge(arr,l,mid,r);
    }
}
