public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {10,11,10,5,9,10,10,5,10,9};
        int res = majorityElement(arr,arr.length);
        System.out.println("The element appearing majority time: " +res);
    }

    static int majorityElement(int a[],int size){
//        This question is based on Boyer-Moores Voting Algorithm
    /*
    Approach :
    1. Assume 1st element to be the most occuring element //max_index=0
    2. Initialize count=1;
    3. Start counter from i=1 and check
    if( a[i] != a[max_index] )
    count--;
    else
    count++;
    if( count == 0 )
    max_index = i;
    count = 1;
    4. After iteration is complete return a[max_index] this is our most occuring element but ... to check if it really exists or not we have to iterate through the loop one more time
    5. Iterate through loop from i=0 to i=size
    6. If (a[i] == num ) c++;//num=max_index
    7. Check if c>size/2 if yes return num else return -1;
     */
        int max_index = 0;
        int count = 1;
        for (int i = 1; i < size; i++) {
            if(a[i] == a[max_index]){
                count++;
            }
            else{
                count--;
            }

            if(count == 0){
                max_index = i;
                count = 1;
            }
        }

        int freq = 0;
        for (int i = 0; i < size; i++) {
            if(a[i] == a[max_index]){
                freq++;
            }
        }

        if(freq > size/2){
            return a[max_index];
        }
        return -1;
    }
}
