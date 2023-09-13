package Recursion_practice;

import java.util.Scanner;

public class PalindromeUsingRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        boolean ans = isPalindrome(s,0);
        System.out.println(ans);
    }

    static boolean isPalindrome(String s,int i){
        if(i > s.length()/2) return true;

        if(s.charAt(i) != s.charAt(s.length()-i-1)) return false;
        return isPalindrome(s,i+1);
    }
}
