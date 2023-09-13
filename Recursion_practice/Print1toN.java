package Recursion_practice;

import java.util.Scanner;

public class Print1toN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        printN(1,n);
    }

    static void printN(int i,int n){
        if(i > n) return;
        System.out.print(i + " ");
        printN(i+1,n);
    }
}
