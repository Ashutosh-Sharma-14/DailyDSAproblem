package Recursion_practice;

import java.util.Scanner;

public class Backtrack1toN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
//        backtrack(n);
        backtrackNto1(n,1);
    }

    static void backtrack(int n){
        if(n < 1) return;
        backtrack(n-1);
        System.out.print(n + " ");
    }

    static void backtrackNto1(int n, int k){
        if(k > n) return;
        backtrackNto1(n,k+1);
        System.out.print(k + " ");
    }
}
