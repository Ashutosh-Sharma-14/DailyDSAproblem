public class RotateArrayByKplaces {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        rotate(arr,arr.length,2);
        for (int a = 0; a < arr.length; a++) {
            System.out.print(arr[a] + " ");
        }
    }

    static void reverse(int[] arr, int start, int end){
        while(start <= end){
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            start++;
            end--;
        }
    }

    static void rotate(int[] arr, int n, int k){
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
        reverse(arr,0,n-1);
    }
}
