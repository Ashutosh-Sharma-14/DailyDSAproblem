import java.util.Arrays;

public class LargestCommonPrefix {
    public static void main(String[] args) {
        String[] arr = {"geek","geeks","geeksforgeeks","geezer"};
        String res = longestCommonPrefix(arr,arr.length);
        System.out.println(res);
    }

//    solved the question with this approach
    static String longestCommonPrefix(String arr[], int n){
        String smallest = arr[0];
        for (int i = 1; i < n; i++) {
            if(arr[i].length() < smallest.length()){
                smallest = arr[i];
            }
        }
        int l = smallest.length();
        int slen = 0;
        for (int i = 1; i <= l; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
               if(arr[j].substring(0,i).equals(smallest.substring(0,i))) {
                   count++;
               }
            }
            if(count < n){
                break;
            }
            else{
                slen++;
            }
        }
       return slen > 0? smallest.substring(0,slen) : "-1";
    }

//    better approach - if the String array is sorted, the elements are arranged in the lexographical order. So we just need to compare the first and last
//    elements to find the longest common prefix
    static String longestcomPrefix(String arr[],int n){
        Arrays.sort(arr);
        String first = arr[0];
        String last = arr[n-1];
        int l = first.length();
        int i = 0;
        String common = "";

        while(last.substring(0,i).equals(first.substring(0,i))){
            common += first.substring(0,i);
            i++;
        }

        return common.length() > 0? common:"-1";
    }
}
