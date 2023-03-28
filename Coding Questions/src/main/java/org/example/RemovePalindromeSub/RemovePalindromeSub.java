package org.example.RemovePalindromeSub;

import static org.example.Palindrome.Palindrome.isPalindrome;

public class RemovePalindromeSub {

    public static int removePalindromeSub(String s) {
        if(s.length()==0) return 0;
        if(isPalindrome(s)) return 1;
        return 2;
    }

    public static void main(String[] args) {
        System.out.println(removePalindromeSub("ababa"));
        System.out.println(removePalindromeSub("abb"));
    }
}
