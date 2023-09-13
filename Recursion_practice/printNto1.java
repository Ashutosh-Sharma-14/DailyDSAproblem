package Recursion_practice;

import java.util.Scanner;

public class printNto1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
//        printNto1(n);
        printjtok(20,6);
    }

    static void printNto1(int n){
        if(n == 0) return;
        System.out.print(n+" ");
        printNto1(n-1);
    }

//    here j > k
    static void printjtok(int start, int end){
        if(start < end) return;
        System.out.print(start + " ");
        printjtok(start-1,end);
    }
}
