package org.example.ReverseString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseString {

    public static String reverseString(String str){
        char ch[] =str.toCharArray();
        int start=0,end=str.length()-1;
        while(start<end)
        {
            char temp= ch[start];
            ch[start]=ch[end];
            ch[end]=temp;
            start++;
            end--;
        }
        return String.valueOf(ch);
    }
    public static void main(String[] args) {
        System.out.println(reverseString("Rajat Prakash"));
    }
}
