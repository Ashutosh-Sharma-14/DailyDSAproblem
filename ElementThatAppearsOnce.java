// question link: https://practice.geeksforgeeks.org/problems/element-appearing-once2552/0?company[]=Qualcomm&company[]=Qualcomm&difficulty[]=1&page=1&query=company[]Qualcommdifficulty[]1page1company[]Qualcomm

public class ElementThatAppearsOnce {
    public static void main(String[] args) {
        int[] arr = {5,5,8,8,11,11,12,12,14,14,24,27,27,28,28,31,31,45,45};
        int res = search(arr,arr.length);
        System.out.println(res);
    }

    static int search(int[] arr,int n){
        int start = 0;
        int end = n-1;

        while(start <= end){
            int mid = start + (end-start)/2;
            if(arr[mid]!=arr[mid-1] && arr[mid]!=arr[mid+1]){
                return arr[mid];
            }

            if(mid%2 == 0){
                if(arr[mid] == arr[mid+1])
                    start = mid+1;
                else
                    end = mid-1;
            }
            else{
                if(arr[mid] == arr[mid-1]){
                    start = mid+1;
                }
                else
                    end = mid-1;
            }
        }
        return -1;
    }
}
