package Medium;

import java.util.Scanner;

public class BleakNumbers {
    public static void main(String[] args) {
        int num = 4;
        int ans = is_bleak(num);
        System.out.println(ans);
    }

    static int is_bleak(int n)
    {
        // Code here
        int num=String.valueOf(Math.log(n)).length() + 1;
        for(int i=n-num;i<n;i++)
        {
            if(i+Integer.bitCount(i)==n)
            {
                return 0;
            }
        }
        return 1;
    }
}
