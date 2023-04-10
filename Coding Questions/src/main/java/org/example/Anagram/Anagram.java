package org.example.Anagram;

import java.util.Arrays;

public class Anagram {
    public static boolean isAnagram(String s,String t){
        char[] a =s.toCharArray(),b =t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        s=String.valueOf(a);
        t=String.valueOf(b);
        return s.equals(t);
    }
    public static void main(String[] args) {
        System.out.println(isAnagram("Rajat","tajaR"));

        System.out.println(isAnagram("Rajat","tajaRaty"));
    }
}
