package Recursion_practice;

import java.util.Scanner;

public class SumOfNnumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
//        sumOfN(n,0);
//        int ans = sum(n);
//        int fact = factorial(n);
        parameterizedFactorial(n,1);
//        System.out.println(fact);
    }

//    parameterized function - where parameter is changed with the function call
    static void sumOfN(int n,int sum){
        if(n < 1) {
            System.out.println(sum);
            return;
        }
        sumOfN(n-1,sum+n);
    }

//    functional recursion - answer is returned, instead of printing the answer
    static int sum(int n){
        if(n < 1) return 0;

        return n + sum(n-1);
    }

    static void parameterizedFactorial(int n, int fact){
        if(n < 1){
            System.out.println(fact);
            return;
        }

        parameterizedFactorial(n-1,fact*n);
    }

    static int factorial(int n){
        if(n < 1) return 1;
        return n*factorial(n-1);
    }
}
