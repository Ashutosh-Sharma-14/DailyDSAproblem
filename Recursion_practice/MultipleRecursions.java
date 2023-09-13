package Recursion_practice;

import java.util.Scanner;

public class MultipleRecursions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = fibo(n);
        System.out.println(ans);
    }

    static int fibo(int n){
        if(n <= 1) return n;
        int secondLast = fibo(n-2);
        int last = fibo(n-1);

        return last+secondLast;
    }
}
